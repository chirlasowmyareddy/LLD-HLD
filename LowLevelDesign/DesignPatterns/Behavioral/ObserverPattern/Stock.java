package LLD_HLD.LowLevelDesign.DesignPatterns.Behavioral.ObserverPattern;

import LLD_HLD.LowLevelDesign.DesignPatterns.Behavioral.ObserverPattern.Observable.IPhoneObservableImpl;
import LLD_HLD.LowLevelDesign.DesignPatterns.Behavioral.ObserverPattern.Observable.StockObservable;
import LLD_HLD.LowLevelDesign.DesignPatterns.Behavioral.ObserverPattern.Observer.EmailAlertObserverImpl;
import LLD_HLD.LowLevelDesign.DesignPatterns.Behavioral.ObserverPattern.Observer.MobileAlertObserverImpl;
import LLD_HLD.LowLevelDesign.DesignPatterns.Behavioral.ObserverPattern.Observer.NotificationAlertObserver;

public class Stock {

    public static void main(String[] args){

        StockObservable iphoneStocksObservable = new IPhoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz@gmail.com",iphoneStocksObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("abc@gmail.com",iphoneStocksObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("qwe@gmail.com",iphoneStocksObservable);

        iphoneStocksObservable.add(observer1);
        iphoneStocksObservable.add(observer2);
        iphoneStocksObservable.add(observer3);

        iphoneStocksObservable.setStockCount(10);

        iphoneStocksObservable.setStockCount(-10);

        iphoneStocksObservable.remove(observer2);

        int stockCount = iphoneStocksObservable.getStockCount();
        System.out.println("Amount of stock is " + stockCount);

        iphoneStocksObservable.setStockCount(100);

    }
}
