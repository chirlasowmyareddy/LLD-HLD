package LLD_HLD.LowLevelDesign.DesignPatterns.Behavioral.ObserverPattern.Observer;

import LLD_HLD.LowLevelDesign.DesignPatterns.Behavioral.ObserverPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StockObservable stockObservable;

    public EmailAlertObserverImpl(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendEmail(emailId,"product is in stock hurry up!");

    }

    private void sendEmail(String emailId,String message) {

        System.out.println("mail sent to:" + emailId);
        //send the actual email to the end user
    }
}
