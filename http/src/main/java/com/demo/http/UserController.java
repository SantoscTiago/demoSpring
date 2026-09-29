package com.demo.http;

import com.demo.repo.repository.UserRepo;
import com.demo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService =  userService;
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        var result = userService.findAll();

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(result);
    }
}
