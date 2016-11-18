package com.company;

public class GameField {
    private final int ARRAY_VERTICAL = 6;
    private final int ARRAY_HORIZONTAL = 7;
    private Chip[][] arr;

    public void field() {
        arr = new Chip[ARRAY_VERTICAL][ARRAY_HORIZONTAL];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = Chip.EMPTY;
            }
        }
    }

    public void print() {
        System.out.println("");
        System.out.print("1 2 3 4 5 6 7");
        for (int i = 0; i < 6; i++) {
            System.out.println(" ");
            for (int j = 0; j < 7; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
        }
    }

    public Chip[][] getArr() {
        return arr;
    }

    public boolean game(Chip chip) {
        return horizontalCheck(chip) || verticalCheck(chip) || diagN1(chip) || diagN2(chip) || diagN3(chip) || diagN4(chip);
    }

    private boolean diagN4(Chip chip) {
        int tmp = 6;
        int X = 0;
        int temp = 1;
        while (tmp != 2) {
            for (int i = 0, j = temp; i < tmp; i++, j++) {
                if (arr[i][j] == chip) {
                    X++;
                } else {
                    X = 0;
                }
                if (X == 4) return true;

            }
            tmp--;
            temp++;
        }
        return false;
    }

    private boolean diagN3(Chip chip) {
        int tmp = 3;
        int X = 0;
        while (tmp != 6) {
            for (int i = 5, j = tmp; j >= 0; i--, j--) {
                if (arr[i][j] == chip) {
                    X++;
                } else {
                    X = 0;
                }
                if (X == 4) return true;
            }
            tmp++;
        }
        return false;
    }

    private boolean diagN2(Chip chip) {
        int tmp = 3;
        int X = 0;
        while (tmp != 0) {
            for (int i = 5, j = tmp; j < 7; i--, j++) {
                if (arr[i][j] == chip) {
                    X++;
                } else {
                    X = 0;
                }
                if (X == 4) return true;
            }
            tmp--;
        }
        return false;
    }

    private boolean diagN1(Chip chip) {
        int X = 0;
        int tmp = 3;
        while (tmp != 6) {
            for (int i = tmp, j = 0; j < tmp; i--, j++) {
                if (arr[i][j] == chip) {
                    X++;
                } else {
                    X = 0;
                }
                if (X == 4) return true;
            }
            tmp++;
        }
        return false;
    }

    private boolean verticalCheck(Chip chip) {
        int X = 0;
        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < 6; i++) {
                if (arr[i][j] == chip) {
                    X++;
                } else {
                    X = 0;
                }
                if (X == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean horizontalCheck(Chip chip) {
        int X = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (arr[i][j] == chip) {
                    X++;
                } else {
                    X = 0;
                }
                if (X == 4) {
                    return true;
                }
            }
        }
        return false;
    }
}
