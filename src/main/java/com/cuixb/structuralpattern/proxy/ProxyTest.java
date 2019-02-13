package com.cuixb.structuralpattern.proxy;

/**
 * 代理模式是一种结构型设计模式，它可以为其他对象提供一种代理以控制对这个对象的访问。
 * <p>
 * 所谓代理，是指具有与被代理对象相同的接口的类，客户端必须通过代理与被代理的目标类进行交互，
 * 而代理一般在交互的过程中（交互前后），进行某些特定的处理。
 */
public class ProxyTest {
    public static void main(String[] args) {
        AbstractObject proxy = new ProxyObject(new RealObject());
        proxy.operation();
    }
}
