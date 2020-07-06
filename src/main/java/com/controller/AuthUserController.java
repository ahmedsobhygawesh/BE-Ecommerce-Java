package com.controller;

import com.model.CurrentUserAndLoginUserModel;
import com.model.UserModel;
import com.service.SayHelloService;
import com.service.UserService;
import com.util.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthUserController {

    @Autowired SayHelloService sayHelloService;
    @Autowired private UserService userService;
    @Autowired private JwtTokenUtil jwtTokenUtil;

    @PostMapping({"user-registration"})
    public ResponseEntity<?> userRegistration(@RequestBody UserModel user) throws Exception {
        userService.userRegistration(user);
        return ResponseEntity.ok(200);
    }

    @PostMapping({"/user-login"})
    public UserModel userLogin(@RequestBody UserModel usr) throws Exception {
      return userService.userLogin(usr);
    }


}
