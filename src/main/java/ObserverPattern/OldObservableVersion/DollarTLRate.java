package ObserverPattern.OldObservableVersion;

import java.util.Observable;
import java.util.Observer;

public class DollarTLRate implements Observer {

    Observable observable;
    float dollar;
    float tl;

    public DollarTLRate(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof ExchangeRates){
            ExchangeRates exchangeRates = (ExchangeRates) o;
            this.dollar = exchangeRates.getDollar();
            this.tl = exchangeRates.getLira();
            display();
        }
    }

    public void display(){
        System.out.println("Current Dollar / Tl Parity is : " + dollar/tl);
    }
}
