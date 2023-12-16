package ObserverPattern.ExchangeRateObserver;

import java.util.ArrayList;
import java.util.List;

public class ExchangeRateDataProvider implements Subject{
    private List<Observer> observers;
    private float dollar,euro,lira,yen,dinar;

    public ExchangeRateDataProvider() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            //observer.update(dollar,euro,lira,yen,dinar);
            observer.update();
        }
    }

    public void exchangesChanged(){
        notifyObservers();
    }

    public void setExchanges(float dollar, float euro, float lira, float yen, float dinar) {
        this.dollar = dollar;
        this.euro = euro;
        this.lira = lira;
        this.yen = yen;
        this.dinar = dinar;
        exchangesChanged();
    }

    public float getDollar() {
        return dollar;
    }

    public float getEuro() {
        return euro;
    }

    public float getLira() {
        return lira;
    }

    public float getYen() {
        return yen;
    }

    public float getDinar() {
        return dinar;
    }
}
