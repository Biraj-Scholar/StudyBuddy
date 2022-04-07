package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class AppUserController {

    private final AppUserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<AppUser>> getUsers(){
        return ResponseEntity.ok().body(userService.getAllUser());
    }

    @GetMapping("/user")
    public AppUser getUser(@RequestParam(value = "name", defaultValue = "") String name) {
        //use userService to find user
        //AppUser mAppUser = userService.getUser(name);
        AppUser mAppUser = new AppUser();
        return mAppUser ;
    }

}
