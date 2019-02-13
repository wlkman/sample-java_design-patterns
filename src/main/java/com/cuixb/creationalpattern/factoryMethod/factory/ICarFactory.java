package com.cuixb.creationalpattern.factoryMethod.factory;

import com.cuixb.creationalpattern.factoryMethod.product.Car;

public interface ICarFactory {
    /**
     * 获取交通工具
     */
    Car getCar();
}
