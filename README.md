# SDP Assignment 3

Bridge pattern using a pizzeria example.

`Pizza` is the abstraction; `Margherita` and `Pepperoni` are its subclasses.
`Oven` is the implementor interface; `ElectricOven` and `WoodOven` are its implementations.
A pizza calls `oven.bake()`. In `Main`, `setOven()` switches the oven for the same pizza object.

Clean Code:

- Meaningful names: `Pizza`, `Oven`, `cook`, and `bake` describe their purpose.
- Single responsibility: a pizza defines its type; an oven handles baking.
- Small methods: each method performs one simple action.
- Dependency on an interface: a pizza uses `Oven` without depending on a specific oven class.
- Open for extension: a new oven can be added without changing the pizza classes.

Run from the project folder with JDK 17 or newer:

```bash
javac --release 17 -d out src/com/company/Main.java src/com/company/pizza/*.java src/com/company/oven/*.java
java -cp out com.company.Main
```
