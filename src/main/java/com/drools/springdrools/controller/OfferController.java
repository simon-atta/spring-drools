package com.drools.springdrools.controller;

import com.drools.springdrools.model.Order;
import org.kie.api.runtime.KieSession;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OfferController {

    private final KieSession session;

    public OfferController(KieSession session) {
        this.session = session;
    }

    @PostMapping("/order")
    public Order orderNow(@RequestBody Order order) {
        session.insert(order);
        session.fireAllRules();
        return order;
    }

}
