package observer;

import observer.notification.Email;
import observer.notification.MobileApp;
import observer.notification.TextMessage;
import observer.order.Order;
import observer.order.OrderStatus;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(110L, OrderStatus.REGISTERED);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);

        order.notifyObservers();

        System.out.println("-------------------------------------");

        order.changeOrderStatus(OrderStatus.SHIPPED);

        System.out.println("-------------------------------------");

        order.unregisterObserver(textMessage);

        order.changeOrderStatus(OrderStatus.DELIVERED);
    }
}
