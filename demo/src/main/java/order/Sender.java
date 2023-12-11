package order;

import java.util.Random;

public class Sender implements User{
    public int id;

    public Sender(){
        Random random = new Random();

        this.id =  random.nextInt(10^9 - 1) + 1;
    }

    @Override
    public void update(String status) {
        System.out.println("Order for " + id + " is " + status + "!");
    }
}
