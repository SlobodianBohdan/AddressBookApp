package com.softserve.itacademy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/records/read")
public class ReadRecordServlet extends HttpServlet {

    private  RecordDao recordDao;

    @Override
    public void init(){
        recordDao = RecordDao.getInstance();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Record record = recordDao.read(request.getParameter("firstName"), request.getParameter("lastName"));
        if (record != null) {
            request.setAttribute("record", record);
            request.getRequestDispatcher("/WEB-INF/read-record.jsp").forward(request, response);
        }

        record = new Record();
        record.setFirstName(request.getParameter("firstName"));
        record.setLastName(request.getParameter("lastName"));
        request.setAttribute("record", record);
        request.getRequestDispatcher("/WEB-INF/error.jsp").forward(request, response);
    }
}