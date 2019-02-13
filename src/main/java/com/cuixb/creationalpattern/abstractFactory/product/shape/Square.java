package com.cuixb.creationalpattern.abstractFactory.product.shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
