package com.cuixb.creationalpattern.builder.item.colddrink;

import com.cuixb.creationalpattern.builder.item.Item;
import com.cuixb.creationalpattern.builder.packing.Bottle;
import com.cuixb.creationalpattern.builder.packing.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}