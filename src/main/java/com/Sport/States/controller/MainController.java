package com.Sport.States.controller;





import com.Sport.States.domain.Football;
import com.Sport.States.domain.Tournament;
import com.Sport.States.repo.FootballRepo;
import com.Sport.States.repo.PlayerRepo;
import com.Sport.States.repo.TournamentRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("main")
public class MainController {
    private final FootballRepo footballRepo;
    private final TournamentRepo tournamentRepo;
    private final PlayerRepo playerRepo;

    @Value("${spring.profiles.active}")
    private String profile;

    @Autowired
    public MainController(FootballRepo footballRepo, TournamentRepo tournamentRepo, PlayerRepo playerRepo) {
        this.footballRepo = footballRepo;
        this.tournamentRepo = tournamentRepo;
        this.playerRepo = playerRepo;
    }

    @GetMapping("/allFootball")
    public List<Football> footballs(){
        return footballRepo.findAll();
    }

    @GetMapping("/tournaments")
    public List<Tournament> list(){
        return tournamentRepo.findAll();
    }


        @GetMapping("{playerone}")
    private Football getPlayerone(@PathVariable("playerone") Football football) {
        return football;
    }

     @GetMapping("{playertwo}")
    private Football getPlayertwo(@PathVariable("playertwo") Football football) {
    return football;
    }

    @GetMapping("{tournament}")
   private Football getTournament(@PathVariable("tournament") Football football) {
      return football;
    }








}






