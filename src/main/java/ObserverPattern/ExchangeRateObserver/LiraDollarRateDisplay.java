package ObserverPattern.ExchangeRateObserver;

public class LiraDollarRateDisplay implements DisplayExchangeRate, Observer{
    private float lira,dollar;
    private final ExchangeRateDataProvider exchangeRateDataProvider;

    public LiraDollarRateDisplay(ExchangeRateDataProvider exchangeRateDataProvider) {
        this.exchangeRateDataProvider = exchangeRateDataProvider;
        exchangeRateDataProvider.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Lira/Dollar Parity is : " + lira/dollar);
    }

    @Override
    public void update() {
        this.dollar = exchangeRateDataProvider.getDollar();
        this.lira = exchangeRateDataProvider.getLira();
        display();
    }
}
