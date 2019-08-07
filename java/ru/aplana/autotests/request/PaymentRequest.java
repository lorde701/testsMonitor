package ru.aplana.autotests.request;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class PaymentRequest {

    @Getter @Setter
    private int userId;

    @Getter @Setter
    private String itemId;

    @Getter @Setter
    private double discount;
}