package com.prep.snakeladder;

import lombok.Data;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Data
public class Game {

    private final Board board;
    private final Queue<Player> players;
    private final Dice dice = new Dice();

    public Game(Board board, List<Player> playerList) {
        this.board = board;
        this.players = new LinkedList<>(playerList);
    }

    public void start() {
        while (true) {
            Player current = players.poll();
            int roll = dice.roll();
            System.out.println(current.getName() + " rolled a " + roll);

            int newPosition = board.getNextPosition(current.getPosition(), roll);
            current.setPosition(newPosition);
            System.out.println(current.getName() + " moved to " + newPosition);

            if (board.isWinningPosition(newPosition)) {
                System.out.println(current.getName() + " wins the game!");
                break;
            }
            players.offer(current);
        }
    }

}
