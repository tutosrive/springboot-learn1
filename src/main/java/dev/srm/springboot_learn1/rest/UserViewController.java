package dev.srm.springboot_learn1.rest;

import dev.srm.springboot_learn1.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/users/view")
public class UserViewController {
    private final UserService userService = new UserService();

    @GetMapping
    public String getUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users/all";
    }

    @GetMapping("/search")
    public String getUserById(@RequestParam(name = "id") int id, Model model) {
        try {
            model.addAttribute("user", userService.getUserById(id));
            return "users/user";
        } catch (Exception e) {
            return "404";
        }
    }
}
