package ua.edu.ucu.lab7.lab7.delivery;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public double delivery(double orderPrice) {
        System.out.println("DHL delivery: ");
        if (orderPrice > 2000) {
            return 0;
        }
        return 200;
    }
}
