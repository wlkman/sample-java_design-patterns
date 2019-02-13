package com.cuixb.creationalpattern.builder;

import com.cuixb.creationalpattern.builder.item.burger.ChickenBurger;
import com.cuixb.creationalpattern.builder.item.burger.VegBurger;
import com.cuixb.creationalpattern.builder.item.colddrink.Coke;
import com.cuixb.creationalpattern.builder.item.colddrink.Pepsi;

public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
