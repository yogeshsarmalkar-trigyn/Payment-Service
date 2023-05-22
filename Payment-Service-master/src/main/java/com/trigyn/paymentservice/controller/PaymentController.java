package com.trigyn.paymentservice.controller;

import com.trigyn.paymentservice.model.Payment;
import com.trigyn.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payment")
    public List<Payment> getPriceList(){
        return paymentService.getPriceList();
    }

    @PostMapping("/payment")
    public Boolean addItem(@RequestBody Payment payment){
        return paymentService.addItem(payment);
    }
}
