package com.example.demo.api;


import com.example.demo.controller.AuthController;
import com.example.demo.model.User;
import com.example.demo.model.Userlogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
public class AuthorizationApi {
    @Autowired
    AuthController authController;

    @PostMapping("/login")
    public Optional<String> login(@RequestBody Userlogin userlogin) {
        return authController.login(userlogin);
    }


    @GetMapping("/users/me")
    public ResponseEntity<Optional<User>> getMe(@RequestHeader Map<String, String> headers) {
        if(headers.get("authorization") == null) {
            return new ResponseEntity(HttpStatus.FORBIDDEN);
        }
        String jwtToken = headers.get("authorization").split(" ")[1];
        Optional<User> user = authController.getMe(jwtToken);
        if(!user.isPresent()) {
            return new ResponseEntity(HttpStatus.FORBIDDEN);
        }
        return new ResponseEntity(user, HttpStatus.OK);
    }
}
