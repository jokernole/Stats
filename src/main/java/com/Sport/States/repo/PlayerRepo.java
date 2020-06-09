package com.Sport.States.repo;


import com.Sport.States.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepo extends JpaRepository<Player, Long> {
}
