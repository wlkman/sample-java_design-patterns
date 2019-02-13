package com.cuixb.structuralpattern.bridge.shape;

import com.cuixb.structuralpattern.bridge.drawAPI.DrawAPI;

public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}