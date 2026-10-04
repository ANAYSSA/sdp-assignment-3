# SDP Assignment 3

Bridge на примере пиццерии.

`Pizza` — абстракция, `Margherita` и `Pepperoni` — её подклассы.
`Oven` — интерфейс, `ElectricOven` и `WoodOven` — реализации.
Пицца вызывает `oven.bake()`. В `Main` метод `setOven()` меняет печь у той же пиццы.

Clean Code:

- Понятные имена: `Pizza`, `Oven`, `cook`, `bake` показывают назначение.
- Одна ответственность: пицца определяет вид, печь отвечает за выпекание.
- Короткие методы: каждый выполняет одно простое действие.
- Зависимость от интерфейса: пицца использует `Oven` без привязки к конкретной печи.
- Открытость к расширению: новую печь можно добавить без изменения классов пиццы.

Запуск из папки проекта, нужен JDK 17 или новее:

```bash
javac --release 17 -d out src/com/company/Main.java src/com/company/pizza/*.java src/com/company/oven/*.java
java -cp out com.company.Main
```
