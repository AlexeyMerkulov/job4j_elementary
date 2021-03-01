package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book schildt = new Book("Schildt", 1100);
        Book cleanCode = new Book("Clean code", 700);
        Book horstmann = new Book("Horstmann", 1300);
        Book algo = new Book("Algorithms", 600);
        Book[] books = new Book[4];
        books[0] = schildt;
        books[1] = cleanCode;
        books[2] = horstmann;
        books[3] = algo;
        for (int i = 0; i < books.length; i++) {
            Book ex = books[i];
            System.out.println(ex.getBookName() + " " + ex.getPagesNum());
        }
        System.out.println("Меняем местами книги с индексом 0 и 3");
        Book copy = books[0];
        books[0] = books[3];
        books[3] = copy;
        for (int i = 0; i < books.length; i++) {
            Book ex = books[i];
            System.out.println(ex.getBookName() + " " + ex.getPagesNum());
        }
        System.out.println("Вывод книг с названием \"Clean code\"");
        for (int i = 0; i < books.length; i++) {
            Book ex = books[i];
            if (ex.getBookName().equals("Clean code")) {
                System.out.println(ex.getBookName() + " " + ex.getPagesNum());
            }
        }

    }
}
