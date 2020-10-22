package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Петров Алексей Васильевич");
        student.setGroup("ФА-12-20");
        student.setEntrance(new Date());

        System.out.println("Студент " + student.getName() + " учится в группе " + student.getGroup()
                + ", в которую зачислен " + student.getEntrance());
    }
}
