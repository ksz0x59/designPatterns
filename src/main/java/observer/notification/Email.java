package observer.notification;

import observer.order.Order;

public class Email implements Observer {
    @Override
    public void update(Order order) {
        System.out.println(" Email - order number : " + order.getOrderNumber() + " has changed status to " + order.getOrderStatus() );
    }
}
