package decorators;

import flower.store.Item;
import lombok.ToString;

@ToString
public class BasketDecorator extends ItemDecorator {
    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 4 + this.item.getPrice();
    }

}
