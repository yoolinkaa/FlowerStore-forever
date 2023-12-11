package order;

import java.util.ArrayList;
import java.util.List;

import flower.store.Item;

public class QuickOrder extends Order {
    private List<Item> items = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    private QuickOrder(List<Item> items, User user) {
        this.items = items;
        addUser(user);
        order();
    }

    public QuickOrder createQuickOrder(List<Item> items, User user) {
        return new QuickOrder(items, user);
    }
}
