import java.util.Scanner;

/** Creates and handles menu options as well as price calculation */

/*
MenuOrder.java
 */

public class MenuOrder {

    static double runningTotal;
    static double subTotal;
    private static double itemPrice;
    static boolean ordering = true; //Controls the menu loop
    static Scanner input = new Scanner(System.in);

    public static void menu() {
        System.out.println("Welcome \n1. Burger ($2.00) \n2. Fries ($1.50)\n3. Soda ($1.00) \n4. Done");
    }


    public static double itemPrice(int foodItem) {
        if (foodItem == 1) {
            // burger= $2.00
            System.out.println("You've ordered a burger");
            itemPrice = 2.00;
        }
        if (foodItem == 2) {
            // fries = $1.50
            System.out.println("You've ordered fries");
            itemPrice = 1.50;
        }
        if (foodItem == 3) {
            // soda = $1.00
            System.out.println("You've ordered a soda");
            itemPrice = 1.00;
        }
        return quantity();

    }
    //Asks how many of each item the user wants
    public static double quantity() {
        System.out.println("Enter quantity");
        double quantity = input.nextDouble();
        return subTotal(quantity, itemPrice);

    }

    //Calculates cost of item based on quantity
    public static double subTotal(double quantity, double itemPrice) {
        subTotal = quantity * itemPrice;
        runningTotal += subTotal;
        return subTotal;
    }

    //Exits the menu
    public static void done(double runningTotal) {
        ordering = false;
        System.out.println("Enjoy your meal");
    }

    public double fullMenu() {
        int menuOption;
        int foodItem;
        runningTotal = 0;
        input = new Scanner(System.in);
        do{
            menu();
            menuOption = input.nextInt();
            switch(menuOption){
                case 1:
                    foodItem = 1;
                    runningTotal += itemPrice(foodItem);
                    break;
                case 2:
                    foodItem = 2;
                    runningTotal += itemPrice(foodItem);
                    break;
                case 3:
                    foodItem = 3;
                    runningTotal += itemPrice(foodItem);
                    break;
                case 4:
                    done(runningTotal);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while(ordering);
        return runningTotal; //Total cost of all selected items
    }
}
