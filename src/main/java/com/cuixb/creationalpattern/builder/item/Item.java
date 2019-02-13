package com.cuixb.creationalpattern.builder.item;

import com.cuixb.creationalpattern.builder.packing.Packing;

public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
