package ru.job4j.oop;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle airbus = new Airplane();
        Vehicle boeing = new Airplane();
        Vehicle sapsan = new Train();
        Vehicle strizh = new Train();
        Vehicle volvo = new Bus();
        Vehicle ikarus = new Bus();
        Vehicle[] vehicles = new Vehicle[]{airbus, boeing, sapsan, strizh, volvo, ikarus};
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}
