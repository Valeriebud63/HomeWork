package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class HW4GameXO {
    private static char[][] map = new char[3][3];
    private static Scanner sc = new Scanner(System.in);
    private static Random rand = new Random();
    private static final int CONSTANT_ONE = 1;
    private static void initMap() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                map[i][j] = '*';
            }
        }
    }
}

private static void printMap() {
    System.out.println("0 1 2 3");
    for (int i = 0; i < 3; i++) {
        System.out.print((i + 1) + " ");
        for (int j = 0; j < 3; j++) {
            System.out.print(map[i][j] + " ")
        }
        System.out.println();
    }
    System.out.println();
}

private static void main(String[] args) {
    initMap();
    printMap();

    while (true) {
        humanTurn();
        printMap();
        if (checkWin('X')) {
            System.out.println("Победил игрок");
            break;
        }
        if (isMapFull()) break;
        aiTurn();
        printMap();
        if (checkWin('O')) {
            System.out.println("Победил компьютер");
            break;
        }
        if (isMapFull()) break;
    }
    System.out.println("Игра окончена");
}

public static boolean chekWin(char ox) {
    if (map[0][0] == ox && map[0][1] == ox && map[0][2] == ox) return true;
    if (map[1][0] == ox && map[1][1] == ox && map[1][2] == ox) return true;
    if (map[2][0] == ox && map[2][1] == ox && map[2][2] == ox) return true;

    if (map[0][0] == ox && map[1][0] == ox && map[2][0] == ox) return true;
    if (map[0][1] == ox && map[1][1] == ox && map[2][1] == ox) return true;
    if (map[0][2] == ox && map[1][2] == ox && map[2][2] == ox) return true;

    if (map[0][0] == ox && map[1][1] == ox && map[2][2] == ox) return true;
    if (map[2][0] == ox && map[1][1] == ox && map[0][2] == ox) return true;
    return false;
}

private static void humanTurn() {
    int x, y;
    do {
        System.out.println("Введите координаты в формате Х и Y");
        x = sc.nextInt() - 1;
        y = sc.nextInt() - 1;
    } while (!isCellEmpty(x, y));
    map[y][x] = 'X';
}

public static boolean isMapFull() {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
        if (map[i][j] == '*') return false;
        }
    }
    return true;
}

    private static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(3);
            y = rand.nextInt(3);
        } while (!isCellEmpty(x, y));
        map[y][x] = 'O';
        }

        public static boolean isCellEty(int x, int y) {
    if (x < 0 || x > 2 || y < 0 || y > 2) return false;
    if (map[y][x] != '*') return false;
        return true;
        }