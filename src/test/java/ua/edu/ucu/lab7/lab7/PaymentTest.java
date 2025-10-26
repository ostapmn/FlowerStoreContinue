package ua.edu.ucu.lab7.lab7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ua.edu.ucu.lab7.lab7.payment.Payment;
import ua.edu.ucu.lab7.lab7.payment.PayPalPaymentStrategy;
import ua.edu.ucu.lab7.lab7.payment.CreditCardPaymentStrategy;

public class PaymentTest {
    static final double AMOUNT = 100.0;
    static final double COMMISSION_PAYPAL = 0.03;
    static final double COMMISSION_CREDIT_CARD = 0.005;

    @Test
    public void testPaymentPayPal() {

        Payment payment = new PayPalPaymentStrategy();
        double finalAmount = AMOUNT * (1 + COMMISSION_PAYPAL);
        assertEquals(payment.pay(AMOUNT), finalAmount);
    }

    @Test
    public void testPaymentCreditCard() {
        Payment payment = new CreditCardPaymentStrategy();
        double finalAmount = AMOUNT * (1 + COMMISSION_CREDIT_CARD);
        assertEquals(payment.pay(AMOUNT), finalAmount);
    }
}
