package ru.job4j.pojo;

public class Book {
    private String bookName;
    private int pagesNum;

    public Book(String bookName, int pagesNum) {
        this.bookName = bookName;
        this.pagesNum = pagesNum;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPagesNum() {
        return pagesNum;
    }

    public void setPagesNum(int pagesNum) {
        this.pagesNum = pagesNum;
    }
}
