package hwibin.prac.mvcframework.mvc;

import hwibin.prac.mvcframework.mvc.controller.Controller;
import hwibin.prac.mvcframework.mvc.controller.HomeController;

import java.util.HashMap;
import java.util.Map;

public class RequestMappingHandlerMapping {

    private Map<String, Controller> mapping = new HashMap<>();

    void init(){
        mapping.put("/",new HomeController());
    }

    public Controller findHandler(String urliPath){
        return mapping.get(urliPath);
    }

}
