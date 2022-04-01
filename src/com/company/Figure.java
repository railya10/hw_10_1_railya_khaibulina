package com.company;

public abstract class Figure {
    static String unit = "cm";
    private int perimeter;

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public Figure (){
    }

    public abstract int calculateArea();
    public abstract int calculatePerimeter();
    public abstract String info();
}