package com.softserve.itacademy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/records/update")
public class UpdateRecordServlet extends HttpServlet {

    private RecordDao recordDao;
    private Record record;

    @Override
    public void init() {
        recordDao = RecordDao.getInstance();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        record = recordDao.read(request.getParameter("firstName"), request.getParameter("lastName"));
        request.setAttribute("record", record);
        request.getRequestDispatcher("/WEB-INF/update-record.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        record.setAddress(request.getParameter("address"));
        recordDao.update(record);

        response.sendRedirect("/records/list");

    }
}
