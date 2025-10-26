package ua.edu.ucu.lab7.lab7;


import ua.edu.ucu.lab7.lab7.delivery.Delivery;
import ua.edu.ucu.lab7.lab7.delivery.PostalDeliveryStrategy;
import ua.edu.ucu.lab7.lab7.delivery.DHLDeliveryStrategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeliveryTest {
    static final double SMALL_ORDER_PRICE_POSTAL = 100.0;
    static final double LARGE_ORDER_PRICE_POSTAL = 1500.0;
    static final double SMALL_ORDER_PRICE_DHL = 1500.0;
    static final double LARGE_ORDER_PRICE_DHL = 2500.0;

    @Test
    public void testDeliveryPostal() {
        Delivery postalDelivery = new PostalDeliveryStrategy();
        assertEquals(postalDelivery.delivery(SMALL_ORDER_PRICE_POSTAL), 100.0);
        assertEquals(postalDelivery.delivery(LARGE_ORDER_PRICE_POSTAL), 0.0);
    }

    @Test
    public void testDeliveryDHL() {
        Delivery dhlDelivery = new DHLDeliveryStrategy();
        assertEquals(dhlDelivery.delivery(SMALL_ORDER_PRICE_DHL), 200.0);
        assertEquals(dhlDelivery.delivery(LARGE_ORDER_PRICE_DHL), 0.0);
    }
}
