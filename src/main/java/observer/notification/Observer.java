package observer.notification;

import observer.order.Order;

public interface Observer {

    public void update (Order order);
}
