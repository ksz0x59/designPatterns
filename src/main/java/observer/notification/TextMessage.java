package observer.notification;

import observer.order.Order;

public class TextMessage implements Observer {

    @Override
    public void update(Order order) {
        System.out.println(" Txt message - order number : " + order.getOrderNumber() + " has changed status to " + order.getOrderStatus() );
    }

}
