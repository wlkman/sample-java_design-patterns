package com.cuixb.creationalpattern.builder.item.burger;

import com.cuixb.creationalpattern.builder.item.Item;
import com.cuixb.creationalpattern.builder.packing.Packing;
import com.cuixb.creationalpattern.builder.packing.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();

}
