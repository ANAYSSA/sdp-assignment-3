package com.company.pizza;

import com.company.oven.Oven;

public class Margherita extends Pizza {
    public Margherita(Oven oven) {
        super(oven);
    }

    @Override
    public void cook() {
        oven.bake("Margherita");
    }
}
