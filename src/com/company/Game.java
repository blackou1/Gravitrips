package com.company;

public class Game {
    public void game() {

        Computer computer = new Computer();
        GameField gameField = new GameField();
        Player player = new Player();

        gameField.field();
        boolean flagOfX = false;
        boolean flagOfO = false;

        while (!flagOfX || !flagOfO) {
            gameField.print();
            player.player(gameField.getArr());
            flagOfX = gameField.game(Chip.X);
            computer.computer(gameField.getArr());
            flagOfO = gameField.game(Chip.O);
        }
    }
}
