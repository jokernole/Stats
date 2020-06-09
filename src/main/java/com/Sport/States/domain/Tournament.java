package com.Sport.States.domain;

import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "football")
@ToString(of = {"id","tournament"})
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tournament;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTournament() {
        return tournament;
    }

    public void setTournament(String tournament) {
        this.tournament = tournament;
    }


}
