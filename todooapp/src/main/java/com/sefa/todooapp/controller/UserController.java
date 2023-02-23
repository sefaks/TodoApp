package com.sefa.todooapp.controller;


import com.sefa.todooapp.entity.User;
import com.sefa.todooapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {


private final UserService userService;

    @PostMapping(path="/add-user")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return  new ResponseEntity<>(userService.saveUser(user), CREATED);
    }

    @GetMapping("/getall")
    public ResponseEntity<List<User>> getAll() {
        return ResponseEntity.ok(userService.getAll());
    }

    @GetMapping("/{id}")
    private User getUserById( @PathVariable int id) {
        return userService.getUserById(id);
    }

    @DeleteMapping("/{id}")

    public ResponseEntity<Void> deleteUser(@PathVariable  int id){
        userService.deleteUser(id);

        return new ResponseEntity<>(HttpStatus.OK);

    }
}
