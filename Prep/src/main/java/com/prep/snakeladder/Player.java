package com.prep.snakeladder;

import lombok.Data;

@Data
public class Player {

    private final String name;
    private int position;

    public Player(String name) {
        this.name = name;
        this.position = 0;
    }

}
