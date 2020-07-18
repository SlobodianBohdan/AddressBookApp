package com.softserve.itacademy;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class RecordDao {
    private List<Record> Records = new LinkedList<>();

    private static RecordDao RecordDaoInstance = null;

    private RecordDao() {

    }

    public static RecordDao getInstance() {
        if (RecordDaoInstance == null) {
            RecordDaoInstance = new RecordDao();
            return RecordDaoInstance;
        }
        return RecordDaoInstance;
    }

    public boolean create(Record record) {
        if (!record.getFirstName().isEmpty() && !record.getLastName().isEmpty()) {
            if (read(record.getFirstName(),record.getLastName()) == null){
                return Records.add(record);
            }
        }
        return false;
    }

    public Record read(String firstName, String lastName) {
        return Records.stream().filter(
                Record -> Record.getFirstName().equals(firstName)
                        & Record.getLastName().equals(lastName)
        ).findFirst().orElse(null);
    }

    public boolean update(Record record) {
        int index = Records.indexOf(read(record.getFirstName(), record.getLastName()));
        return Records.set(index, record) != null;
    }

    public boolean delete(String firstName, String lastName) {
        boolean result = false;
        for (Record rec : Records) {
            result = rec.getFirstName().equals(firstName) & rec.getLastName().equals(lastName) ? Records.remove(rec) : false;
        }
        return result;
    }

    public List<Record> readAll() {
        return Records;
    }

    public enum SortOrder {
        ASC, DESC;
    }

    public void sortedBy(SortOrder order) {
        Comparator<Record> sort = Comparator.comparing(Record::getFirstName).thenComparing(Record::getLastName);
        if (order.equals(SortOrder.DESC)) {
            sort = sort.reversed();
        }
        Collections.sort(Records, sort);
    }
}
