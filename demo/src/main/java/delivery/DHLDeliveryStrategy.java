package delivery;

public class DHLDeliveryStrategy implements Delivery {

    @Override
    public boolean deliver(String deliveryWay) {
        return (deliveryWay.equalsIgnoreCase("dhl") ||
                deliveryWay.equalsIgnoreCase("dhldelivery"));
    }
}