package com.cuixb.creationalpattern.factoryMethod.factory;

import com.cuixb.creationalpattern.factoryMethod.product.Bike;
import com.cuixb.creationalpattern.factoryMethod.product.Car;

public class BikeFactory implements ICarFactory {

    @Override
    public Car getCar() {
        return new Bike();
    }
}
