package db;

import order.Receiver;
import order.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionTest {
    Connection connection;

    @BeforeEach
    void setUp() {
        connection = new Connection();
    }

    @Test
    void getConnection() {
        assertEquals(new ArrayList<>(), connection.getConnection().ids);
    }

    @Test
    void addUserId() {
        User user = new Receiver();
        connection.addUserId(user);
        assertEquals(1, connection.ids.size());
    }

    @Test
    void removeUserId() {
        User user1 = new Receiver();
        User user2 = new Receiver();
        connection.addUserId(user1);
        connection.addUserId(user2);
        connection.removeUserId(user2);
        assertEquals(1, connection.ids.size());
    }
}