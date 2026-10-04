package com.company.oven;

public class WoodOven implements Oven {
    @Override
    public void bake(String pizzaName) {
        System.out.println(pizzaName + " is baked in a wood oven.");
    }
}
