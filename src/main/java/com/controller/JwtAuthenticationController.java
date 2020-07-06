package com.controller;

import com.model.JwtRequest;
import com.model.JwtResponse;
import com.model.UserModel;
import com.service.UserService;
import com.service.impl.JwtUserDetailsServiceImpl;
import com.util.JwtTokenUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.AuthenticationManager;


@RestController
@CrossOrigin
public class JwtAuthenticationController {

    @Autowired private JwtTokenUtil jwtTokenUtil;
    @Autowired private JwtUserDetailsServiceImpl userDetailsService;
    @Autowired private AuthenticationManager authenticationManager;

//    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
//    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {
////        authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());
//        final User userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
//        final String token = jwtTokenUtil.generateToken(userDetails);
//        return ResponseEntity.ok(new JwtResponse(token));
//    }

//    private void authenticate(String username, String password) throws Exception {
//        try {
//            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
//        } catch (DisabledException e) {
//            throw new Exception("USER_DISABLED", e);
//        } catch (BadCredentialsException e) {
//            throw new Exception("INVALID_CREDENTIALS", e);
//        }
//    }
}
