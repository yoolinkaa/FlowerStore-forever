package order;

import delivery.DHLDeliveryStrategy;
import delivery.PostDeliveryStrategy;
import payment.CreditCardPaymentStrategy;
import payment.PayPalPaymentStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {
    private static List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public static void removeUser(User user) {
        users.remove(user);
    }

    public static void notifyUser() {
        for (int i = 0; i < users.size(); i++) {
            users.get(i).update("notified");
        }
    }

    public ArrayList getUser() {
        return (ArrayList) users;
    }

    public void order() {
        this.notifyUser();
    }

    public static void deliver(int num) {
        if (num == 0) {
            DHLDeliveryStrategy delivery = new DHLDeliveryStrategy();
            delivery.deliver("dhl");
        } else {
            PostDeliveryStrategy delivery = new PostDeliveryStrategy();
            delivery.deliver("post");
        }
    }

    public static void pay(int num, double price) {
        if (num == 0) {
            CreditCardPaymentStrategy pay = new CreditCardPaymentStrategy();
            pay.pay(price);
        } else {
            PayPalPaymentStrategy pay = new PayPalPaymentStrategy();
            pay.pay(price);
        }
    }

    private static String id;

    public static String generateID() {
        Random rand = new Random();
        int upperbound = 99;
        for (int i = 0; i < 10; i++) {
            id += rand.nextInt(upperbound);
        }
        return id;
    }
}