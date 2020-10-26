package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        int[] player = {1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1};
        int i = 0;
        while (true) {
            System.out.print("Игрок №" + player[i] + ", возьмите спички от 1 до 3 ");
            int num = Integer.valueOf(input.nextLine());
                matches -= num;
                System.out.println("На столе осталось " + matches + " спичек");
                if (matches == 0) {
                    System.out.println("Игрок №" + player[i] + " победил");
                    break;
                }
                i++;
            }
        }
    }