package com.cuixb.structuralpattern.facade;

import com.cuixb.structuralpattern.facade.shape.Circle;
import com.cuixb.structuralpattern.facade.shape.Rectangle;
import com.cuixb.structuralpattern.facade.shape.Shape;
import com.cuixb.structuralpattern.facade.shape.Square;

/**
 * 创建一个外观类。
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
