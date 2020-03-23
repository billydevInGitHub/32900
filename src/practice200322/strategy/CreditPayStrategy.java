package practice200322.strategy;

public class CreditPayStrategy implements PayStrategy {
    String cardHolderName;
    String expiryDate;
    String cardNumber;

    public CreditPayStrategy(String cardHolderName, String expiryDate, String cardNumber) {
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("credit card pay:"+amount);
    }
}
