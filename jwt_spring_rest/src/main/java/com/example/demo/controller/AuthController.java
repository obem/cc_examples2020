package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.model.Userlogin;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Controller;

import javax.xml.bind.DatatypeConverter;
import java.util.HashMap;
import java.util.Optional;

@Controller
public class AuthController {
    private static final String SECRET_KEY= "MY_SECRET";
    /**
     * Get this from the databse and do not save this static in the code
     */
    private HashMap<String, User> users = new HashMap<>();

    public AuthController() {
        //pw is usually not saved in plaintext
        this.users.put("niklas", new User("niklas", "test123", "my personal data belongs to me"));
    }

    public Optional<String> login(Userlogin userlogin) {
        if(users.get(userlogin.getUsername()).getPassword().equals(userlogin.getPassword())) {
            return Optional.of(generateJWT(userlogin.getUsername()));
        }
        return Optional.empty();
    }

    public Optional<User> getMe(String jwt) {
        try {
            Claims claims = Jwts.parser()
                    .setSigningKey(DatatypeConverter.parseBase64Binary(SECRET_KEY))
                    .parseClaimsJws(jwt).getBody();

            return Optional.of(users.get(claims.getSubject()));
        }catch (Exception e) {
            return Optional.empty();
        }
    }


    private String generateJWT(String username) {
        return Jwts.builder().setSubject(username).signWith(SignatureAlgorithm.HS256, DatatypeConverter.parseBase64Binary(SECRET_KEY)).compact();
    }
}
