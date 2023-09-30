package challenge.two.models;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limit;
    private double balance;
    private final List<Shopping> shoppingList;

    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.shoppingList = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public List<Shopping> getShoppingList() {
        return shoppingList;
    }

    public boolean addPurchase(Shopping shopping) {
        if (this.balance > shopping.getValue()) {
            this.balance -= shopping.getValue();
            this.shoppingList.add(shopping);
            return true;
        }

        return false;
    }
}
