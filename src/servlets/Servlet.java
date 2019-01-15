package servlets;

import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * Created by wangchuan on 19/1/15.
 */
//public class Servlet extends javax.servlet.http.HttpServlet {
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String name = new String(request.getParameter("name").getBytes("iso-8859-1"),"utf-8");
        if (name.equals("猪")) {
            response.sendRedirect("index.jsp");
        }
        response.sendRedirect("index.jsp");
    }

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request, response);
    }
}
