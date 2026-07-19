package dev.srm.springboot_learn1.rest;

import dev.srm.springboot_learn1.models.UserModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
    @GetMapping("/users")
    public UserModel[] getUsers() {
        return new UserModel[]{
                new UserModel("Santiago", "Rivera Marin", "srm@gmail.com", 21),
                new UserModel("Eduardo", "López Sánchez", "edu@gmail.com", 27)
        };
    }
}
