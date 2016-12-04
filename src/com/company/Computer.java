package com.company;

import java.util.Random;

public class Computer implements Player {
    @Override
    public void move(Chip[][] array) {
        Random random = new Random();
        int input, i = 5;
        input = random.nextInt(7);
        boolean a = false;
        while (!a) {
            if (array[i][input] == Chip.EMPTY) {
                array[i][input] = Chip.O;
                a = true;
            } else i--;
        }
    }
}