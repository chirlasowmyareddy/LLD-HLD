package LLD_HLD.LowLevelDesign.DesignPatterns.Behavioral.ObserverPattern.Observer;

import LLD_HLD.LowLevelDesign.DesignPatterns.Behavioral.ObserverPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StockObservable stockObservable;

    public MobileAlertObserverImpl(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendNotification(emailId,"product is in stock hurry up!");
    }

    private void sendNotification(String emailId, String message) {

        System.out.println("mail sent to:" + emailId);
        //mobile notification sent logic
    }
}
