package com.demo.service;

import com.demo.repo.entity.Club;
import com.demo.repo.repository.ClubRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubService {
    private final ClubRepo clubRepo;

    public ClubService(ClubRepo clubRepo) {
        this.clubRepo = clubRepo;
    }

    public List<Club> findAll() {
        return clubRepo.findAll();
    }
}
