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
        int ruble = 420;
        int euro = Converter.rubleToEuro(ruble);
        int dollar = Converter.rubleToDollar(ruble);
        System.out.println(ruble + " rubles are " + euro + " euro.");
        System.out.println(ruble + " rubles are " + dollar + " dollars.");
    }
}