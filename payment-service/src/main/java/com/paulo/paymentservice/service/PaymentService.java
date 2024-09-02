package com.paulo.paymentservice.service;

import com.paulo.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
