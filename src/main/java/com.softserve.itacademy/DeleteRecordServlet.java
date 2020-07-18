package com.softserve.itacademy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/records/delete")
public class DeleteRecordServlet extends HttpServlet {

    private RecordDao recordDao;

    @Override
    public void init(){
        recordDao = RecordDao.getInstance();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        recordDao.delete(request.getParameter("firstName"), request.getParameter("lastName"));
 //       recordDao.delete(Integer.parseInt(request.getParameter("id")));
        response.sendRedirect("/records/list");
    }
}
