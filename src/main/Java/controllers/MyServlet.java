package controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by в on 22.06.2016.
 */
public class MyServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        if (request.getParameter("jsp").equals("index")) {
            request.getSession().setAttribute("number1", "1");
            response.sendRedirect("index2.jsp");
//        request.getRequestDispatcher("index2.jsp").forward(request,response);
        } else if (request.getParameter("jsp").equals("index2")) {
            request.getSession().setAttribute("number2", "2");
            response.sendRedirect("index.jsp");
//            request.getRequestDispatcher("index.jsp").forward(request,response);
        }
    }
}
