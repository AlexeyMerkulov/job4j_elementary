package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        int counter = 1;
        while (true) {
            System.out.print("Игрок №" + counter + ", возьмите спички от 1 до 3 ");
            int num = Integer.valueOf(input.nextLine());
            if (num < 1 || num > 3) {
                System.out.println("Введено некорректное значение, попробуйте ещё раз");
                continue;
            } else {
                matches -= num;
                System.out.println("На столе осталось " + matches + " спичек");
                if (matches == 0) {
                    System.out.println("Игрок №" + counter + " победил");
                    break;
                }
                if (counter == 1) {
                    counter = 2;
                } else {
                    counter = 1;
                }
            }
        }
    }
}