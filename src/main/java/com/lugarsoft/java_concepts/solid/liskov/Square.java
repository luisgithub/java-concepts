package com.lugarsoft.java_concepts.solid.liskov;

public class Square implements Shape{
    public Square(double side){
        this.side = side;
    }
    private double side;

    @Override
    public double computeArea() {
        return side * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
