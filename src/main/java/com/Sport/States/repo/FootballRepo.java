package com.Sport.States.repo;

import com.Sport.States.domain.Football;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FootballRepo extends JpaRepository<Football, Long> {
}
