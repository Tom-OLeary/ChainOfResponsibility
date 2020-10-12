/*
Cook.java
 */

public class Cook extends OrderHandler {
    public void manageOrder(int n, double cost){
        int waitTime = 10; //seconds
        System.out.println("Please wait while your order is Processed: ");

        //Processes order for 10 seconds before completion
        try {
            for (int i=0; i<waitTime; i++) {
                Thread.sleep(1000);
                System.out.println("...");
            }
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Your Order Is Complete!");
        System.out.println("-----RECEIPT-----");
        System.out.println("Order Number: " + n);
        System.out.println("Cost: " + cost);
        System.out.println("-----------------");
    }
}