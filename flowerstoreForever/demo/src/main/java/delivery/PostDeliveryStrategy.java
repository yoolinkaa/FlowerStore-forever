package delivery;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public boolean deliver(String deliveryWay) {
        return deliveryWay.equalsIgnoreCase("post") ||
                deliveryWay.equalsIgnoreCase("post delivery") ||
                deliveryWay.equalsIgnoreCase("postdelivery");
    }
}