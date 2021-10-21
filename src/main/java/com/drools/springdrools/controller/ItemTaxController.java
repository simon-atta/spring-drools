package com.drools.springdrools.controller;

import com.drools.springdrools.model.ItemCity;
import com.drools.springdrools.model.Order;
import org.kie.api.runtime.KieSession;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemTaxController {

    private final KieSession session;

    public ItemTaxController(KieSession session) {
        this.session = session;
    }

    @PostMapping("/tax")
    public ItemCity orderNow(@RequestBody ItemCity itemCity) {
        session.insert(itemCity);
        session.fireAllRules();
        return itemCity;
    }

}
