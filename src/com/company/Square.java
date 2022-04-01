package com.company;

public class Square extends Figure {
    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
        this.setPerimeter(calculatePerimeter());
    }


    @Override
    public int calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    public int calculatePerimeter() {
        return sideLength * 4;
    }

    @Override
    public String info() {
        return
                "\nSquare side length: " + sideLength + Figure.unit +
                        "\nperimeter: " + getPerimeter() + Figure.unit +
                        "\narea: " + calculateArea() + Figure.unit;
    }
}

