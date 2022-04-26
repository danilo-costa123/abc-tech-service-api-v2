package br.com.fiap.abctechservice.handler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class ErrorMessageResponseTests {
    private ErrorMessageResponse errorMessageResponse;
    private Date date;

    @BeforeEach
    public void setUp() {
        date = new Date();
        errorMessageResponse = new ErrorMessageResponse();
    }

    @Test
    public void test_errorMessageResponse_not_null() {
        Assertions.assertNotNull(errorMessageResponse);
    }

    @Test
    public void test_errorMessageResponse_args() {
        errorMessageResponse = new ErrorMessageResponse(404, date, "Test message", "Test description");
        Assertions.assertNotNull(errorMessageResponse);
    }

    @Test
    public void test_errorMessageResponse_status_code() {
        errorMessageResponse.setStatusCode(500);
        Assertions.assertEquals(errorMessageResponse.getStatusCode(), 500);
    }

    @Test
    public void test_errorMessageResponse_date() {
        Date dt = new Date();
        errorMessageResponse.setTimestamp(dt);
        Assertions.assertEquals(errorMessageResponse.getTimestamp(), dt);
    }

    @Test
    public void test_errorMessageResponse_message() {
        errorMessageResponse.setMessage("New test message");
        Assertions.assertEquals(errorMessageResponse.getMessage(), "New test message");
    }

    @Test
    public void test_errorMessageResponse_description() {
        errorMessageResponse.setDescription("New description");
        Assertions.assertEquals(errorMessageResponse.getDescription(), "New description");
    }
}