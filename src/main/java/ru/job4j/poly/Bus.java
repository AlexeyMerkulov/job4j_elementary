package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {

    }

    @Override
    public void passengers(int number) {
        int passengerNum = number;
    }

    @Override
    public int fillFuel(int fuel) {
        return fuel * 47;
    }
}
