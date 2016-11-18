package com.company;

import java.util.Scanner;

public class Player {
    public void player(Chip[][] array) {
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
