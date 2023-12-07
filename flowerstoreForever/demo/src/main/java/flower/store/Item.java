package flower.store;

public abstract class Item {

    public abstract double getPrice();

    public abstract String getDescription();

    private double price;

    public void addFlower(Flower flower) {
    }

    public void setPrice(double i) {
        this.price = i;
    }

}