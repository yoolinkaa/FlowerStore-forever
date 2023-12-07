package decorators;

import flower.store.Item;
import lombok.ToString;

@ToString
public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 40 + this.item.getPrice();
    }

}
