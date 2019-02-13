package com.cuixb.creationalpattern.singleton;

/**
 * 饿汉式（静态常量）[可用]
 *
 * 这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
 */
public class Singleton3 {

    private final static Singleton3 INSTANCE = new Singleton3();

    private Singleton3(){}

    public static Singleton3 getInstance(){
        return INSTANCE;
    }
}
