package ru.aplana.autotests.request;

import lombok.Getter;
import lombok.Setter;

public class PaymentRequest {

    @Getter @Setter
    private int userId;

    @Getter @Setter
    private String itemId;

    @Getter @Setter
    private double discount;
}