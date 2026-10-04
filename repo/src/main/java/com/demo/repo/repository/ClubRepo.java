package com.demo.repo.repository;

import com.demo.repo.entity.Club;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClubRepo extends JpaRepository<Club, Long> {
}
