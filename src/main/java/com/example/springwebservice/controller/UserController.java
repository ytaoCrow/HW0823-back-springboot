package com.example.springwebservice.controller;

import com.example.springwebservice.controller.dto.response.StatusResponse;
import com.example.springwebservice.controller.dto.request.CreateUserRequest;
import com.example.springwebservice.controller.dto.request.UpdateUserRequest;
import com.example.springwebservice.model.entity.User;
import com.example.springwebservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {

    @Autowired
    UserService userService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/api/v1/user")
    public List<User> getAllUsers() {
        List<User>response=this.userService.getUserList();
        return response;
    }
    //@PathVariable 唯一識別
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/api/v1/user/{id}")
    public User getUser(@PathVariable int id) {
        User response=this.userService.getUserById(id);
        return response;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/api/v1/user")
    public StatusResponse createUser(@RequestBody CreateUserRequest request) {
        String response=(this.userService.createUser(request));
        return new StatusResponse(response);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/api/v1/user/{id}")
    public StatusResponse updateUser(@PathVariable int id,@RequestBody UpdateUserRequest request) {
        String response=this.userService.updateUser(id,request);
        return new StatusResponse(response);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/api/v1/user/{id}")
    public StatusResponse deleteUser(@PathVariable int id) {
        String reponse =this.userService.deleteUser(id);

        return new StatusResponse(reponse);
    }
} // Class end
