package dev.srm.springboot_learn1.services;

import dev.srm.springboot_learn1.models.UserModel;

import java.util.ArrayList;
import java.util.Arrays;

public class UserService {
    private final ArrayList<UserModel> users = new ArrayList<>();

    public UserService() {
        for (int i = 0; i < 100; i++) {
            UserModel user = new UserModel();
            this.users.add(user);
        }
    }

    public ArrayList<UserModel> getAllUsers() {
        return this.users;
    }

    public final UserModel getUserById(int id) {
        return this.users.stream().filter(us -> us.getId() == id).toList().getFirst();
    }

    public final void setUser(UserModel user) {
        this.users.add(user);
    }

    public final void setUsers(UserModel[] users) {
        this.users.addAll(Arrays.asList(users));
    }
}
