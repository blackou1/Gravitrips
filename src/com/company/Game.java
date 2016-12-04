package com.company;

public class Game {
    public void game() {

        Player computer = new Computer();
        GameField gameField = new GameField();
        Player humanPlayer = new HumanPlayer();

        boolean playerWin = false;
        boolean computerWin = false;

        while (!playerWin && !computerWin) {
            gameField.print();
            humanPlayer.move(gameField.getArr());
            playerWin = gameField.gameCheck(Chip.X);
            computer.move(gameField.getArr());
            computerWin = gameField.gameCheck(Chip.O);
        }
        gameField.print();
    }
}
