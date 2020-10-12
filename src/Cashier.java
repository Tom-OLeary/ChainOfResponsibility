/*
Cashier.java
 */

public class Cashier extends OrderHandler {

    //Generates Receipt
    public void manageOrder(int n, double cost){
        System.out.println("-----RECEIPT-----");
        System.out.println("Cost: " + cost);
        System.out.println("Order Number: " + n);
        System.out.println("-----------------");

        orderHandler.manageOrder(n, cost);
    }
}