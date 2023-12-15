package hwibin.prac.mvcframework.mvc;

import hwibin.prac.mvcframework.mvc.controller.Controller;
import javax.servlet.RequestDispatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.IOException;

@WebServlet("/")
public class DispatcherServlet extends HttpServlet {

    private static final Logger log = LoggerFactory.getLogger(DispatcherServlet.class);

    private RequestMappingHandlerMapping rehm;

    @Override
    public void init() throws ServletException {
        rehm = new RequestMappingHandlerMapping();
        rehm.init();
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("[DispatcherServlet] service started");


        try {
            Controller handler = rehm.findHandler(request.getRequestURI());

            String viewName = handler.handlerRequest(request, response);

            RequestDispatcher requestDispatcher = request.getRequestDispatcher(viewName);
            requestDispatcher.forward(request, response);

        } catch (Exception e) {
            log.error("exception occurred: [{}]", e.getMessage(), e);
            throw new ServletException(e);
        }


    }
}
