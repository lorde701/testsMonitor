package ru.aplana.autotests.requests;

import lombok.Getter;
import lombok.Setter;
import ru.aplana.autotests.enums.TestStatus;

public class SendMessageRequest {

    @Getter @Setter
    private String projectName;

    @Getter @Setter
    private String testName;

    @Getter @Setter
    private TestStatus testStatus;
}