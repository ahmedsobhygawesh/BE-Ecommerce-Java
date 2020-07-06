package com.controller;

import com.model.UserModel;
import org.springframework.web.bind.annotation.*;

@RestController
public class DashboardController {

    @GetMapping({"/dashboard"})
    public String loadDashboard(@RequestParam String mobile) throws Exception {
        return "AAA";
    }


}
