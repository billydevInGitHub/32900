package practice200322.strategy;

public class PaypalPayStrategy implements  PayStrategy {
    String emailAddress;
    String password;

    public PaypalPayStrategy(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paypal pay:"+amount);
    }
}
