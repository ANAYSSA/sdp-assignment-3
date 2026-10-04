package com.company;

import com.company.oven.ElectricOven;
import com.company.oven.WoodOven;
import com.company.pizza.Margherita;
import com.company.pizza.Pepperoni;
import com.company.pizza.Pizza;

public class Main {
    public static void main(String[] args) {
        Pizza margherita = new Margherita(new ElectricOven());
        margherita.cook();
        margherita.setOven(new WoodOven());
        margherita.cook();

        Pizza pepperoni = new Pepperoni(new WoodOven());
        pepperoni.cook();
        pepperoni.setOven(new ElectricOven());
        pepperoni.cook();
    }
}
