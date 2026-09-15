package com.demo.repository;

import com.demo.entity.Athlete;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AthleteRepository extends JpaRepository<Athlete, Long> {

    List<Athlete> findByClubId(Long clubId);
}