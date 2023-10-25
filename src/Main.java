
public class Main {
    public static void main(String[] args) {

        //Testing the items like Coke
        Item coke = new Item("drink", "coke", 1.50);
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();

        //Testing avocado Item
        Item avocado = new Item("Topping", "avocado", 1.50);
        avocado.printItem();

        //Testing a simple burger
        Burger burger = new Burger("regular", 4.00);
        burger.addToppings("BACON","CHEESE", "MAYO");
        burger.printItem();

        //Testing the regular meal
          MealOrder regularMeal = new MealOrder();
          regularMeal.addBurgerToppings("BACON","CHEESE","MAYO");
          regularMeal.setDrinkSize("LARGE");
          regularMeal.printItemizedList();

        //Testing the secondMeal Turkey Burger (Polymorphism
        MealOrder secondMeal = new MealOrder("turkey", "7-up",
                "chili");
        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.printItemizedList();

        //Testing the deluxeMeal
        MealOrder deluxeMeal = new MealOrder("deluxe", "7-up",
                "chili");
        deluxeMeal.addBurgerToppings("AVOCADO", "BACON",
        "LETTUCE", "CHEESE", "MAYO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();


    }
}