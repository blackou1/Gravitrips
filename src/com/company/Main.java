package com.company;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer();
        GameField gameField = new GameField();
        Player player = new Player();

        gameField.field();
        boolean flag = false;
        boolean flag2 = false;

        while (!flag || !flag2) {
            gameField.print();
            player.player(gameField.getArr());
            flag = gameField.game(Chip.X);
            computer.computer(gameField.getArr());
            flag2 = gameField.game(Chip.O);
        }
    }
}