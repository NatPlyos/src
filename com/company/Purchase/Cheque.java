package com.company.Purchase;

import java.util.concurrent.Callable;

public class Cheque {
    private final Purchase[] purchases;
    private boolean discountCard;
    private static final double DISCOUNT = 0.05;

    public Cheque(Purchase[] purchases, boolean discountCard) {
        this.purchases = purchases;
        this.discountCard = discountCard;
    }

    public double calculateTotalAmount() {
        double total = 0;
        for (Purchase purchase : purchases) {
            total = total + purchase.getPrice() * purchase.getAmount();
        }
        if (discountCard) {
            return total * (1 - DISCOUNT);
        } else {
            return total;
        }
    }


    }


