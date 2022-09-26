package Homeworks.homeworks_21;

import java.util.ArrayList;
import java.util.Scanner;

public class Burger {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> constructorOfBurger = new ArrayList<>();
    static int burgerPrice;

    public static void main(String[] args) {
        isItBurger();
        firsQuestion();
        secondQuestion();
        finalConstructorOfBurger();
    }

    private static void isItBurger() {
        System.out.println("Do you like order a burger? (Yes or No)");
        String isItBurger = input.nextLine();
        if (isItBurger.equalsIgnoreCase("Yes")) {
            constructorOfBurger.add(BurgerName.ClassicBurger.getName());
            burgerPrice = BurgerName.ClassicBurger.getPrice();
        } else if (isItBurger.equalsIgnoreCase("No")) {
            System.out.println("Sorry, but I only work with burgers =(");
            System.exit(0);
        } else {
            System.out.println("I'm sorry. I didn't understand your answer. Try again");
            System.exit(0);
        }
    }

    private static void firsQuestion() {
        System.out.println("Would you like to add some ingredient to your burger? (Yes or No)");
        String firstAnswer = input.nextLine();
        if (firstAnswer.equalsIgnoreCase("Yes")) {
            addComponents();
        } else if (firstAnswer.equalsIgnoreCase("No")) {
            finalConstructorOfBurger();
            System.exit(0);
        } else {
            System.out.println("I'm sorry. I didn't understand your answer. Try again");
            System.exit(0);
        }
    }

    private static void addComponents() {
        System.out.println("You can add the following ingredients at your burger: ");
        listOfComponents();
        System.out.println("Enter the name or number of the ingredient: ");
        String firstAddComponent = input.nextLine();
        switch (firstAddComponent) {
            case "1", "Cheese" -> {
                constructorOfBurger.add(BurgerComponents.Cheese.getNameOfComponents());
                burgerPrice += BurgerComponents.Cheese.getPriceOfComponent();
            }
            case "2", "Sauce" -> {
                constructorOfBurger.add(BurgerComponents.Sauce.getNameOfComponents());
                burgerPrice += BurgerComponents.Sauce.getPriceOfComponent();
            }
            case "3", "Beefsteak" -> {
                constructorOfBurger.add(BurgerComponents.Beefsteak.getNameOfComponents());
                burgerPrice += BurgerComponents.Beefsteak.getPriceOfComponent();
            }
            default -> {
                System.out.println("Yoг enter incorrect components. Please retry.");
                System.exit(0);
            }
        }
    }

    private static void listOfComponents() {
        for (BurgerComponents list : BurgerComponents.values()) {
            System.out.println(list.toString());
        }

    }

    private static void secondQuestion() {
        System.out.println("Would you like to add one more ingredient to your burger? (Yes or No)");
        String secondAnswer = input.nextLine();
        if (secondAnswer.equalsIgnoreCase("Yes")) {
            addComponents();
        } else if (secondAnswer.equalsIgnoreCase("No")) {
            finalConstructorOfBurger();
            System.exit(0);
        } else {
            System.out.println("I'm sorry. I didn't understand your answer. Try again");
            System.exit(0);
        }
    }

    private static void finalConstructorOfBurger() {
        switch (constructorOfBurger.size()) {
            case 1 -> {
                System.out.println("You order: " + constructorOfBurger.get(0) + ".");
                System.out.println("Price of burger = " + burgerPrice);
            }
            case 2 -> {
                System.out.println("You order: " + constructorOfBurger.get(0) + " with " + constructorOfBurger.get(1) + ".");
                System.out.println("Price of burger = " + burgerPrice);
            }
            case 3 -> {
                System.out.println("You order: " + constructorOfBurger.get(0) + " with " + constructorOfBurger.get(1) + " and " + constructorOfBurger.get(2) + ".");
                System.out.println("Price of burger = " + burgerPrice);
            }
        }
    }
}
