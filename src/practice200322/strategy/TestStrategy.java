package practice200322.strategy;

public class TestStrategy {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Item("upc1", 123));
        shoppingCart.addItem(new Item("upc2", 45));
        shoppingCart.pay(new CreditPayStrategy("Billy","202111","12345"));
        shoppingCart.pay(new PaypalPayStrategy("Xiaoxi@luban.com","201907"));
    }
}
