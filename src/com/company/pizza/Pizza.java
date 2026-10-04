package com.company.pizza;

import com.company.oven.Oven;

public abstract class Pizza {
    protected Oven oven;

    public Pizza(Oven oven) {
        this.oven = oven;
    }

    public void setOven(Oven oven) {
        this.oven = oven;
    }

    public abstract void cook();
}
