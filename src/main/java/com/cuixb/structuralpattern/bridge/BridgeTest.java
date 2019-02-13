package com.cuixb.structuralpattern.bridge;

import com.cuixb.structuralpattern.bridge.drawAPI.GreenCircle;
import com.cuixb.structuralpattern.bridge.drawAPI.RedCircle;
import com.cuixb.structuralpattern.bridge.shape.Circle;
import com.cuixb.structuralpattern.bridge.shape.Shape;

/**
 * 桥接（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化。
 * 这种类型的设计模式属于结构型模式，它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦。
 *
 * 这种模式涉及到一个作为桥接的接口，使得实体类的功能独立于接口实现类。这两种类型的类可被结构化改变而互不影响。
 *
 * 我们通过下面的实例来演示桥接模式（Bridge Pattern）的用法。其中，
 * 可以使用相同的抽象类方法但是不同的桥接实现类，来画出不同颜色的圆。
 */
public class BridgeTest {
//    使用 Shape 和 DrawAPI 类画出不同颜色的圆。
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
