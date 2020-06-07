package com.tasks.person;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Adam", "Przeclaw", "ICT", (byte) 7, 0);
        Lecturer lecturer = new Lecturer("Jan", "Szczecin", "Image Processing", 5000);
        System.out.println(student.toString());
        System.out.println(lecturer.toString());

        student.setStudiesCost(500);
        System.out.println(student.toString());
    }
}
