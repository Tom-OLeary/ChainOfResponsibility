/** Handles progression through the chain */

/*
OrderHandler.java
 */

public abstract class OrderHandler
{
    OrderHandler orderHandler;

    //Allows for next handler to be called in the chain
    public void nextHandler(OrderHandler orderHandler) {
        this.orderHandler = orderHandler;
    }
    public abstract void manageOrder(int n, double cost);
}
