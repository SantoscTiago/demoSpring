package com.demo.service;

import com.demo.repo.entity.Athlete;
import com.demo.repo.repository.AthleteRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AthleteService {
    private final AthleteRepo athleteRepo;

    public AthleteService(AthleteRepo athleteRepo) {
        this.athleteRepo = athleteRepo;
    }

    public List<Athlete> findAll() {
        return athleteRepo.findAll();
    }


}
