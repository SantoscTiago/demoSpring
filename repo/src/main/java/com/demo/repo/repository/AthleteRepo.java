package com.demo.repo.repository;

import com.demo.repo.entity.Athlete;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AthleteRepo extends JpaRepository<Athlete, Integer> {
    List<Athlete> findByName(String name);
}
