package com.herbecha.app.controller;

import com.herbecha.app.model.User;
import com.herbecha.app.model.dto.UserDto;
import com.herbecha.app.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/create")
    public void createUser(UserDto userDto) {
        userService.createUser(userDto);
    }

    @DeleteMapping("/delete")
    public void deleteUser(User user) {
        userService.deleteUser(user);
    }

    @PutMapping("/update")
    public void updateUser(User user) {
        userService.updateUser(user);
    }
}
