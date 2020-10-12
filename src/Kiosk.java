/** Creates chain of handlers */

/*
Kiosk.java
 */

public class Kiosk {
    private static Cashier cashier = new Cashier();
    private static Cook cook = new Cook();

    //Creates chain of handlers
    static {
        cashier.nextHandler(cook);
        cook.nextHandler(cashier);
    }

    public void placeOrder(int n, double cost) {
        cashier.manageOrder(n, cost); //Sends order to Cashier
    }
}