package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int in = 420;
        int expected = 6;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("420 rubles are 6 euro. Test result : " + passed);
        expected = 7;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("420 rubles are 7 dollars. Test result : " + passed);
    }
}