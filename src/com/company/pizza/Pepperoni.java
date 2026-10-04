package com.company.pizza;

import com.company.oven.Oven;

public class Pepperoni extends Pizza {
    public Pepperoni(Oven oven) {
        super(oven);
    }

    @Override
    public void cook() {
        oven.bake("Pepperoni");
    }
}
