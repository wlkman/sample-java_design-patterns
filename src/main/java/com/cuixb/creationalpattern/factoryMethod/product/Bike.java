package com.cuixb.creationalpattern.factoryMethod.product;

/**
 * 具体产品角色，自行车
 *
 */
public class Bike implements Car {

    @Override
    public void gotowork() {
        System.out.println("骑自行车去上班！");
    }
}
