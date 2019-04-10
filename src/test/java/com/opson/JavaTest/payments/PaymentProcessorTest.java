package com.opson.JavaTest.payments;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    @Test
    public void payment_is_correct() {
        PaymentsGateway paymentsGateway =Mockito.mock(PaymentsGateway.class);
        Mockito.when(paymentsGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentsGateway);

        assertTrue(paymentProcessor.makePayment(1000));
    }

    @Test
    public void payment_is_failed() {
        PaymentsGateway paymentsGateway =Mockito.mock(PaymentsGateway.class);
        Mockito.when(paymentsGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentsGateway);

        assertFalse(paymentProcessor.makePayment(1000));
    }
}