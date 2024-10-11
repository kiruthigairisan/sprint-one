package com.mit.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {


	    @Autowired
	    private UserService userService;

	    @GetMapping("/users")
	    public List<Users> getAllUsers() {
	        return userService.findAll();
	    }

	    @PostMapping("/users")
	    public ResponseEntity<Users> createUser(@RequestBody Users user) {
	        Users createdUser = userService.save(user);
	        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
	    }

	    @GetMapping("/users/{id}")
	    public ResponseEntity<Users> getUserById(@PathVariable Long id) {
	        Users user = userService.findById(id);
	        return user != null ? new ResponseEntity<>(user, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }

	    @DeleteMapping("/users/{id}")
	    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
	        userService.deleteById(id);
	        return ResponseEntity.noContent().build();
	    }

}
