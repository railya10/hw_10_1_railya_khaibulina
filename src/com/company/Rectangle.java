package com.company;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        this.setPerimeter(calculatePerimeter());
    }

    @Override
    public int calculateArea() {
        return length * width;
    }

    @Override
    public int calculatePerimeter() {
        return ((length + width) * 2);
    }

    @Override
    public String info() {
        return
                "\nRectangle length: " + length + Figure.unit +
                        "\nwidth: " + width + Figure.unit +
                        "\nperimeter: " + getPerimeter() + Figure.unit +
                        "\narea: " + calculateArea() + Figure.unit;
    }
}

