package com.cuixb.behaviorpattern.command.order;

import com.cuixb.behaviorpattern.command.stock.Stock;

public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}