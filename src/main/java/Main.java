import ObserverPattern.OldObservableVersion.DollarTLRate;
import ObserverPattern.OldObservableVersion.ExchangeRates;

public class Main {
    public static void main(String[] args) {


        /* Old Observer Pattern (Deprecated) */
        ExchangeRates exchangeRates = new ExchangeRates();
        DollarTLRate dollarTLRate = new DollarTLRate(exchangeRates);
        exchangeRates.setRates(4,1,4,2,5);
    }
}
