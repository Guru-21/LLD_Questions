package com.prep.snakeladder;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class Board {

    private final int size = 100;
    private final Map<Integer, Integer> snakes = new HashMap<>();
    private final Map<Integer, Integer> ladders = new HashMap<>();


    public Board(List<Snake> snakeList, List<Ladder> ladderList) {
        for (Snake snake : snakeList) {
            snakes.put(snake.getHead(), snake.getTail());
        }
        for (Ladder ladder : ladderList) {
            ladders.put(ladder.getStart(), ladder.getEnd());
        }
    }

    public int getNextPosition(int current, int roll) {
        int next = current + roll;
        if (next > size) return current; // invalid move
        if (snakes.containsKey(next)) {
            System.out.println("Oops! Bitten by a snake at " + next);
            return snakes.get(next);
        }
        if (ladders.containsKey(next)) {
            System.out.println("Yay! Climbed a ladder at " + next);
            return ladders.get(next);
        }
        return next;
    }


    public boolean isWinningPosition(int position) {
        return position == size;
    }

}
