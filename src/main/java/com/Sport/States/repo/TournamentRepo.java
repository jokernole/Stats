package com.Sport.States.repo;


import com.Sport.States.domain.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TournamentRepo extends JpaRepository<Tournament, Long> {
}
