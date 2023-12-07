package delivery;

import java.util.List;

import flower.store.Item;

// public interface Delivery {
//     public String delivery(List<Item> items);
// }
public interface Delivery {
    boolean deliver(String deliveryWay);
}
