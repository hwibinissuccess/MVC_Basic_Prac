package hwibin.prac.reflection_prac.controller;

import hwibin.prac.reflection_prac.annotation.Controller;
import hwibin.prac.reflection_prac.annotation.RequestMapping;
import hwibin.prac.reflection_prac.annotation.RequestMethod;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(HttpServletRequest request, HttpServletResponse response){
        return "home";
    }

}
