package delivery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryTest {
    private DHLDeliveryStrategy dhlDel;
    private PostDeliveryStrategy postDel;

    @BeforeEach
    void setUp() {
        dhlDel = new DHLDeliveryStrategy();
        postDel = new PostDeliveryStrategy();
    }

    @Test
    void deliver() {
        assertEquals(true, dhlDel.deliver("dhl"));
        assertEquals(false, dhlDel.deliver("asd"));
        assertEquals(true, postDel.deliver("post"));
        assertEquals(false, postDel.deliver("wer"));
    }
}