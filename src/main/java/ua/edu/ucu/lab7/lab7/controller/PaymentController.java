package ua.edu.ucu.lab7.lab7.controller;


import ua.edu.ucu.lab7.lab7.payment.Payment;
import ua.edu.ucu.lab7.lab7.payment.PayPalPaymentStrategy;
import ua.edu.ucu.lab7.lab7.payment.CreditCardPaymentStrategy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @GetMapping("/paypal")
    public double payWithPayPal(@RequestParam double amount) {
        Payment payment = new PayPalPaymentStrategy();
        return payment.pay(amount);
    }

    @GetMapping("/creditcard")
    public double payWithCreditCard(@RequestParam double amount) {
        Payment payment = new CreditCardPaymentStrategy();
        return payment.pay(amount);
    }
}
