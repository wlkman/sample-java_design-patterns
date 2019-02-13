package com.cuixb.creationalpattern.factoryMethod;

import com.cuixb.creationalpattern.factoryMethod.factory.BikeFactory;
import com.cuixb.creationalpattern.factoryMethod.factory.BusFactory;
import com.cuixb.creationalpattern.factoryMethod.factory.ICarFactory;
import com.cuixb.creationalpattern.factoryMethod.product.Car;

/**
 * 工厂方法模式：也叫工厂模式，属于类创建型模式，工厂父类（接口）负责定义产品对象的公共接口，而子类工厂则负责创建具体的产品对象。
 *
 * 目的：是为了把产品的实例化操作延迟到子类工厂中完成，通过工厂子类来决定究竟应该实例化哪一个产品具体对象。
 *
 * 工厂方法模式包含四个部分：
 *
 * 1.抽象产品：产品对象同一的基类，或者是同一的接口。
 *
 * 2.具体的产品：各个不同的实例对象类
 *
 * 3.抽象工厂：所有的子类工厂类的基类，或是同一的接口
 *
 * 4.具体的工厂子类：负责每个不同的产品对象的实际创建
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ICarFactory factory = null;
        // bike
        factory = new BikeFactory();
        Car bike = factory.getCar();
        bike.gotowork();

        // bus
        factory = new BusFactory();
        Car bus = factory.getCar();
        bus.gotowork();
    }
}
