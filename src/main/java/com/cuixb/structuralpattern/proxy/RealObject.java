package com.cuixb.structuralpattern.proxy;

public class RealObject extends AbstractObject {
    @Override
    protected void operation() {
        System.out.println("do operation...");
    }
}
