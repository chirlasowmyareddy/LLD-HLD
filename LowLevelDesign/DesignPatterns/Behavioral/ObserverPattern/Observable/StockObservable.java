package LLD_HLD.LowLevelDesign.DesignPatterns.Behavioral.ObserverPattern.Observable;

import LLD_HLD.LowLevelDesign.DesignPatterns.Behavioral.ObserverPattern.Observer.NotificationAlertObserver;

public interface StockObservable {

    public void remove(NotificationAlertObserver observer);

    public void add(NotificationAlertObserver observer);

    public void notifySubscribers();

    public void setStockCount(int newStockAdded);

    public int getStockCount();
}
