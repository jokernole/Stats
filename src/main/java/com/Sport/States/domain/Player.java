package com.Sport.States.domain;

import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "football")
@ToString(of = {"id","playerone", "playertwo"})
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String playerone;
    private String playertwo;

    public String getPlayertwo() {
        return playertwo;
    }

    public void setPlayertwo(String playertwo) {
        this.playertwo = playertwo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlayerone() {
        return playerone;
    }

    public void setPlayerone(String playerone) {
        this.playerone = playerone;
    }
}
