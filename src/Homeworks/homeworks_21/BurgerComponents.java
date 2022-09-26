package Homeworks.homeworks_21;

public enum BurgerComponents {

    Cheese(20, "Cheese", 1), Sauce(10, "Sauce", 2), Beefsteak(30, "Beefsteak", 3);

    private final int priceOfComponent;
    private final String nameOfComponents;
    private final int numberOfElement;


    BurgerComponents(int priceOfComponent, String nameOfComponents, int numberOfElement) {
        this.priceOfComponent = priceOfComponent;
        this.nameOfComponents = nameOfComponents;
        this.numberOfElement = numberOfElement;
    }

    public int getPriceOfComponent() {
        return priceOfComponent;
    }

    public String getNameOfComponents() {
        return nameOfComponents;
    }

    @Override
    public String toString() {
        return numberOfElement + ": " + nameOfComponents + ". Price: " + priceOfComponent;
    }
}
