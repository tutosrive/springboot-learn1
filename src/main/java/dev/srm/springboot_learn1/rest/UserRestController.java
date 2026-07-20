package dev.srm.springboot_learn1.rest;

import dev.srm.springboot_learn1.models.UserModel;
import dev.srm.springboot_learn1.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/users")
public class UserRestController {
    private final UserService service = new UserService();


    @GetMapping
    public ArrayList<UserModel> getUsers() {
        return service.getAllUsers();
    }

    @GetMapping("/search")
    public UserModel getUser(@RequestParam int id) {
        return service.getUserById(id);
    }
}
