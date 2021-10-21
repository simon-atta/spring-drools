package com.drools.springdrools.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ItemCity {
    public enum City {
        PUNE, NAGPUR
    }

    public enum Type {
        GROCERIES, MEDICINES, WATCHES, LUXURYGOODS
    }

    private City purchaseCity;
    private BigDecimal sellPrice;
    private Type typeofItem;
    private BigDecimal localTax;


}
