package com.pramod.user;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8081", maxAge = 3600)

public class UserController {
	@Autowired
	private UserService userService;
	

	    @PostMapping("/create/user")
	    ResponseEntity<User> createUser(@Valid @RequestBody User user) throws URISyntaxException {
	        User saveUser = userService.save(user);
	        
	        return ResponseEntity.created(new URI("/user" + saveUser.getUserID())).body(saveUser);
	    }

	    @GetMapping("/user/getallusers/{id}")


		public User getUser(@PathVariable Integer id){

			User getuser = userService.getUserById(id);

			return getuser;
	   }

	

}
