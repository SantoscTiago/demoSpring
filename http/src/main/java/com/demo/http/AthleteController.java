package com.demo.http;

import com.demo.repo.entity.Athlete;
import com.demo.service.AthleteService;
import org.hibernate.mapping.Any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/athletes")
public class AthleteController {

    private AthleteService athleteService;
    public AthleteController(AthleteService athleteService) {
        this.athleteService = athleteService;
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        var result = athleteService.findAll();

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(result);
    }
}
