package com.Sport.States.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Data
@Table(name = "football")
@ToString(of = {"id","tournament","playerone","playertwo","goalsone","goalstwo","tour"})
@EqualsAndHashCode(of = {"id"})
public class Football {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tournament;
    private String playerone;
    private String playertwo;
    private Long goalsone;
    private Long goalstwo;
    private String tour;

    public String getTour() {
        return tour;
    }

    public void setTour(String tour) {
        this.tour = tour;
    }

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

    public String getPlayerone() {
        return playerone;
    }

    public void setPlayerone(String playerone) {
        this.playerone = playerone;
    }

    public String getPlayertwo() {
        return playertwo;
    }

    public void setPlayertwo(String playertwo) {
        this.playertwo = playertwo;
    }

    public Long getGoalsone() {
        return goalsone;
    }

    public void setGoalsone(Long goalsone) {
        this.goalsone = goalsone;
    }

    public Long getGoalstwo() {
        return goalstwo;
    }

    public void setGoalstwo(Long goalstwo) {
        this.goalstwo = goalstwo;
    }
}