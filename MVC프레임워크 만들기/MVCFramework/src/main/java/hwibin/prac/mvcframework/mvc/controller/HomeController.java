package hwibin.prac.mvcframework.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController implements Controller{
    @Override
    public String handlerRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return "home.jsp";

    }
}
