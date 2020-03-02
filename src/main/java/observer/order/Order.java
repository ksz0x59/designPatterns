package observer.order;

import observer.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class Order implements Observalbe {

    Long orderNumber;
    OrderStatus orderStatus;
    Set<Observer> registeredObservers = new HashSet<Observer>();

    public Order(long orderNumber, OrderStatus orderStatus) {
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
    }

    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    public void notifyObservers() {
        for ( Observer observer : registeredObservers)
        {
            observer.update(this);
        }
    }

    public void changeOrderStatus (OrderStatus orderStatus) {
        setOrderStatus(orderStatus);
        notifyObservers();
    }

    private void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }
}
