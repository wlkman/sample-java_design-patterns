package com.cuixb.behaviorpattern.command.order;

import com.cuixb.behaviorpattern.command.stock.Stock;

public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
