package hwibin.prac.di_framework.controller;

import hwibin.prac.di_framework.annotaion.Controller;
import hwibin.prac.di_framework.annotaion.Inject;
import hwibin.prac.di_framework.service.UserService;

@Controller
public class UserController {

    private final UserService userService;

    @Inject
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public UserService getUserService() {
        return userService;
    }
}
