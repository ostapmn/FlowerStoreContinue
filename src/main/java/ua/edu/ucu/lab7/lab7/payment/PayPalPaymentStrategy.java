package ua.edu.ucu.lab7.lab7.payment;

public class PayPalPaymentStrategy implements Payment {
    static final double COMMISSION = 0.03;
    @Override
    public double pay(double amount) {
        double finalAmount = amount * (1 + COMMISSION);
        System.out.println("Paid " + finalAmount + " using PayPal.");
        return finalAmount;
    }
}
