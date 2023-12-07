package decorators;

import flower.store.Item;
import lombok.Getter;
import lombok.ToString;

@ToString
public class ItemDecorator extends Item {
    protected Item item;

    public ItemDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice();
    }

    @Override
    public String getDescription() {
        return "Decorator";
    }
}
