package com.spring.ums.controller;

import com.spring.ums.entity.User;
import com.spring.ums.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("createUser")
    public ResponseEntity<User> createUser (@RequestBody User user){
        User savedUser = userService.createUser(user);
        return new ResponseEntity<>(savedUser , HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long userId){
        User searchedUser = userService.getUserById(userId);
        return new ResponseEntity<>(searchedUser , HttpStatus.OK);
    }



    @GetMapping("getAllUsers")
    public ResponseEntity<List<User>> getAllUsers(){

        List<User> users = userService.getAllUsers();
        return  new ResponseEntity<>(users , HttpStatus.OK);
    }

    @PutMapping("updateUser/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id ,@RequestBody User user){
        user.setId(id);
        User updatedUser = userService.updateUser(user);
        return  new ResponseEntity<>(updatedUser , HttpStatus.CREATED);
    }

    @DeleteMapping("deleteUser/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable Long id ){
        User delUser = userService.deleteUser(id);
        if(delUser != null){
            return new ResponseEntity<>(delUser , HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null , HttpStatus.NOT_FOUND);
        }
    }
}
