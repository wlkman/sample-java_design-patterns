package com.cuixb.creationalpattern.abstractFactory;

import com.cuixb.creationalpattern.abstractFactory.factory.AbstractFactory;
import com.cuixb.creationalpattern.abstractFactory.factory.ColorFactory;
import com.cuixb.creationalpattern.abstractFactory.factory.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
