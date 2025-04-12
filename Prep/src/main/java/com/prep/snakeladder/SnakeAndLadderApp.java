package com.prep.snakeladder;

import java.util.Arrays;
import java.util.List;

public class SnakeAndLadderApp {

    public static void main(String[] args) {
        List<Snake> snakes = Arrays.asList(
                new Snake(14, 7),
                new Snake(31, 26),
                new Snake(98, 78)
        );

        List<Ladder> ladders = Arrays.asList(
                new Ladder(3, 22),
                new Ladder(8, 30),
                new Ladder(28, 84)
        );

        Board board = new Board(snakes, ladders);
        List<Player> players = Arrays.asList(new Player("Gurpreet"), new Player("Sarvjeet"));

        Game game = new Game(board, players);
        game.start();
    }
}
