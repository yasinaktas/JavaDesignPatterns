package ObserverPattern.OldObservableVersion;

import java.util.Observable;

public class ExchangeRates extends Observable {
    float dollar;
    float euro;
    float lira;
    float dinar;
    float yen;

    public ExchangeRates() {
    }

    public void ratesChanged(){
        setChanged();
        notifyObservers();
    }

    public void setRates(float dollar, float euro, float lira, float dinar, float yen){
        this.dollar = dollar;
        this.euro = euro;
        this.lira = lira;
        this.dinar = dinar;
        this.yen = yen;
        ratesChanged();
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

    public float getDinar() {
        return dinar;
    }

    public float getYen() {
        return yen;
    }
}
