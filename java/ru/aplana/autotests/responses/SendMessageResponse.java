package ru.aplana.autotests.responses;

import lombok.Getter;

public class SendMessageResponse {
    @Getter
    private final String response;

    public SendMessageResponse(String response) {
        this.response = response;
    }
}
