package ru.aplana.autotests.request;

import lombok.*;
import ru.aplana.autotests.enums.TestStatus;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class SendMessageRequest {

    @Getter @Setter
    private String projectName;

    @Getter @Setter
    private String testName;

    @Getter @Setter
    private TestStatus testStatus;
}