package com.Sport.States.controller;

import com.Sport.States.domain.Football;
import com.Sport.States.domain.Player;
import com.Sport.States.repo.FootballRepo;
import com.Sport.States.repo.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("api")
public class ApiController {
    private final FootballRepo footballRepo;
    private final PlayerRepo playerRepo;

    @Autowired
    public ApiController(FootballRepo footballRepo, PlayerRepo playerRepo) {
        this.footballRepo = footballRepo;
        this.playerRepo = playerRepo;
    }


    @GetMapping("allplayers")
    public List<Player> players() {
        return playerRepo.findAll();
    }


    @GetMapping("/player/{playerone}")
    @JsonView({Views.PublicUserInfo.class})
    public Player getPlayer(@PathVariable("plauerone") String pname) {
        return playerRepo.findByPlayerName(pname);
    }


}