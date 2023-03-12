package etu002663.framework.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import mapping.Mapping;

import java.io.IOException;
import java.util.HashMap;

/**
 * The type Servlet generalization.
 */
@WebServlet(name = "ServletGeneralization", value = "/ServletGeneralization")
public class ServletGeneralization extends HttpServlet {

    /**
     * The Mapping url.
     */
    HashMap<String, Mapping> mappingUrl;

    /**
     * Process request.
     *
     * @param request  the request
     * @param response the response
     * @throws ServletException the servlet exception
     * @throws IOException      the io exception
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = request.getRequestURI();
        url = url.substring(request.getContextPath().length());
        response.getWriter().write(url);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
    //modif
}
