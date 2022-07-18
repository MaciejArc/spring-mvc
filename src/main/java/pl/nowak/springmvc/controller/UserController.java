package pl.nowak.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.nowak.springmvc.service.UserService;


@Controller
public class UserController {

private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String getUsers(Model model){

       model.addAttribute("users",userService.getUsers());
        return "gui";
    }
}
