package com.cuixb.creationalpattern.abstractFactory.factory;

import com.cuixb.creationalpattern.abstractFactory.product.color.Blue;
import com.cuixb.creationalpattern.abstractFactory.product.color.Color;
import com.cuixb.creationalpattern.abstractFactory.product.color.Green;
import com.cuixb.creationalpattern.abstractFactory.product.color.Red;
import com.cuixb.creationalpattern.abstractFactory.product.shape.Shape;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}
