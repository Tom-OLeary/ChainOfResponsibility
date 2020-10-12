import java.util.Random;

/** Utilizes the Chain of Responsibility design pattern for placing an order */

/*
Tom O'Leary
Chain.java
 */

public class Chain {
    public static void main( String[] args ){
        Kiosk kiosk = new Kiosk();
        Random rand = new Random();
        MenuOrder menu = new MenuOrder(); //Menu object
        double cost= menu.fullMenu();
        int orderNum = rand.nextInt(100); //Generates random order number

        kiosk.placeOrder(orderNum, cost); //Places order to Kiosk class
    }
}