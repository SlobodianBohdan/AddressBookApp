package com.softserve.itacademy;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/records/list")
public class RecordListServlet extends HttpServlet {
    private  RecordDao recordDao;

    @Override
    public void init(){
        recordDao = RecordDao.getInstance();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sortBY = request.getParameter("sort");
        if (sortBY != null){
            switch (sortBY){
                case "ASC" :
                    recordDao.sortedBy(RecordDao.SortOrder.ASC);
                    break;
                case "DESC" :
                    recordDao.sortedBy(RecordDao.SortOrder.DESC);
                    break;
                default : break;
            }
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/record-list.jsp");
        request.setAttribute("records", recordDao.readAll());
        requestDispatcher.forward(request, response);
    }
}