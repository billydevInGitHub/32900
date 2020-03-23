package practice200322.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void removeItem(Item item) {
        itemList.remove(item);
    }

    public int calculateTotal(){
        int amount=0;
        for (Item item : itemList) {
            amount+=item.getPrice();
        }
        return  amount;
    }

    public void pay(PayStrategy paystrategy){
        paystrategy.pay(calculateTotal());
    }
}
