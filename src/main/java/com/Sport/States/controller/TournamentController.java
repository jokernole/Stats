package com.Sport.States.controller;

import com.Sport.States.domain.Tournament;
import com.Sport.States.repo.TournamentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.xml.ws.Action;

@Controller
public class TournamentController {
    private final TournamentRepo tournamentRepo;

    @Autowired
    public TournamentController(TournamentRepo tournamentRepo) {
        this.tournamentRepo = tournamentRepo;
    }

    @GetMapping("/tournament")
    public String tournaments(Model model){
        List<Tournament> msgs = tournamentRepo.findAll();

        model.addAttribute("tour", msgs);

        return "tournament";
    }



}

}
