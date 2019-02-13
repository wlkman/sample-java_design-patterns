package com.cuixb.creationalpattern.abstractFactory.factory;

import com.cuixb.creationalpattern.abstractFactory.product.color.Color;
import com.cuixb.creationalpattern.abstractFactory.product.shape.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}