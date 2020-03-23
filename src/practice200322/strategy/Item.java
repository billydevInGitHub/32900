package practice200322.strategy;

public class Item {
    String upc;
    int price;

    public Item(String upc, int price) {
        this.upc = upc;
        this.price = price;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
