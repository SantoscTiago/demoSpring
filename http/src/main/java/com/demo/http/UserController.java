package com.demo.http;

import com.demo.http.dto.CreateUserRequest;
import com.demo.repo.entity.User;
import com.demo.repo.repository.UserRepo;
import com.demo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public User create(@RequestBody CreateUserRequest request) {
        return userService.create(request.username(), request.password());
    }
}
