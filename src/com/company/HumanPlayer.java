package com.company;

import java.util.Scanner;

public class HumanPlayer implements Player{

    @Override
    public void move(Chip[][] array) {
        Scanner scanner = new Scanner(System.in);
        int input, i = 5;
        input = scanner.nextInt();
        boolean a = false;
        while (!a) {
            if (array[i][input - 1]== Chip.EMPTY) {
                array[i][input - 1] = Chip.X;
                a = true;
            } else i--;
        }
    }
}
