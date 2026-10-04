package com.demo.http;

import com.demo.repo.entity.Club;
import com.demo.repo.repository.ClubRepo;
import com.demo.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clubs")
public class ClubController {

    private final ClubService clubService;

    public ClubController(ClubService clubService) {
        this.clubService = clubService;
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        var result = clubService.findAll();

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(result);
    }
}
