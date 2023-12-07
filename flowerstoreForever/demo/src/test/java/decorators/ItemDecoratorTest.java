package decorators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemDecoratorTest {
    private ItemDecorator item;
    private ItemDecorator item2;

    @org.junit.jupiter.api.BeforeEach

    void setUp() {
        item = new ItemDecorator(item);
        item.setPrice(10);
        item2 = new BasketDecorator(item);
        item2.setPrice(13);
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(10, item.getPrice());
        assertEquals(13, item2.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getDescription() {
        assertEquals("Decorator", item.getDescription());
    }
}