package com.company;

public class Main {

    public static void main(String[] args) {
        Figure[] figures = {
                new Square(6),
                new Square(8),
                new Rectangle(3, 8),
                new Rectangle(5, 7),
                new Rectangle(9, 12)};
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].info());

        }
    }
}

