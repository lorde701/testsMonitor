package ru.aplana.autotests.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.aplana.autotests.enums.TestStatus;
import ru.aplana.autotests.request.SendMessageRequest;
import ru.aplana.autotests.response.SendMessageResponse;
import ru.aplana.autotests.response.BaseResponse;

@RestController
//@RequestMapping("/payment")
public class SendMessageController {

    private final String sharedKey = "SHARED_KEY";

    private static final String SUCCESS_STATUS = "success";
    private static final String ERROR_STATUS = "error";
    private static final int CODE_SUCCESS = 100;
    private static final int AUTH_FAILURE = 102;

    @RequestMapping(method = RequestMethod.GET)
    public BaseResponse showStatus() {
        return new BaseResponse(SUCCESS_STATUS, 1);
    }

//    @PostMapping("/pay")
//    public BaseResponse pay(@RequestParam(value = "key") String key, @RequestBody PaymentRequest request) {
//
//        final BaseResponse response;
//
//        if (sharedKey.equalsIgnoreCase(key)) {
//            int userId = request.getUserId();
//            String itemId = request.getItemId();
//            double discount = request.getDiscount();
//            // Process the request
//            // ....
//            // Return success response to the client.
//            response = new BaseResponse(SUCCESS_STATUS, CODE_SUCCESS);
//        } else {
//            response = new BaseResponse(ERROR_STATUS, AUTH_FAILURE);
//        }
//        return response;
//    }

    @RequestMapping(value = "/sendMessage", method = RequestMethod.POST, consumes = { MediaType.APPLICATION_JSON_VALUE })
//    @PostMapping("/sendMessage")
    public SendMessageResponse sendMessage(@RequestBody SendMessageRequest request) {

        final SendMessageResponse response;

        String projectName = request.getProjectName();
        String testName = request.getTestName();
        TestStatus testStatus = request.getTestStatus();
        response = new SendMessageResponse(projectName + " " + testName + " " + testStatus);
        return response;
    }
}