package com.company.oven;

public class ElectricOven implements Oven {
    @Override
    public void bake(String pizzaName) {
        System.out.println(pizzaName + " is baked in an electric oven.");
    }
}
