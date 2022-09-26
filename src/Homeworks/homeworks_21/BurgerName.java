package Homeworks.homeworks_21;

public enum BurgerName {
    ClassicBurger(50, "ClassicBurger");
    private final int price;
    private final String name;

    BurgerName(int priceOfComponent, String nameOfComponents) {
        this.price = priceOfComponent;
        this.name = nameOfComponents;

    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
