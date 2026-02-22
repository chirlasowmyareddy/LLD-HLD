package LLD_HLD.LowLevelDesign.DesignPatterns.Behavioral.ObserverPattern.Observable;

import LLD_HLD.LowLevelDesign.DesignPatterns.Behavioral.ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservableImpl implements StockObservable{

    public List<NotificationAlertObserver> observerList = new ArrayList<>();

    int stockCount = 0;

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void notifySubscribers() {

        for(NotificationAlertObserver observer : observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount == 0){
            notifySubscribers();
        }
        stockCount = stockCount + newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
