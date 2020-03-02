package observer.order;

import observer.notification.Observer;

public interface Observalbe {
    public void registerObserver(Observer observer);
    public void unregisterObserver(Observer observer);
    public void notifyObservers();
}
