package com.cuixb.structuralpattern.decorator.decorator;

import com.cuixb.structuralpattern.decorator.shape.Shape;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){

        this.decoratedShape = decoratedShape;
    }

    public void draw(){

        decoratedShape.draw();
    }
}
