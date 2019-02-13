package com.cuixb.creationalpattern.factoryMethod.factory;

import com.cuixb.creationalpattern.factoryMethod.product.Bus;
import com.cuixb.creationalpattern.factoryMethod.product.Car;

public class BusFactory implements ICarFactory {

    @Override
    public Car getCar() {
        return new Bus();
    }
}
