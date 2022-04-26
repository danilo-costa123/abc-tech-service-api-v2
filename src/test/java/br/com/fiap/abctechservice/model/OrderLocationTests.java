package br.com.fiap.abctechservice.model;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

@SpringBootTest
public class OrderLocationTests {
    private OrderLocation orderLocation;

    @BeforeEach
    public void setUp() {
        orderLocation = new OrderLocation();
    }

    @Test
    public void test_order_location_not_null() {
        Assertions.assertNotNull(orderLocation);
    }

    @Test
    public void test_order_location_args() {
        orderLocation = new OrderLocation(new Long(123), 13.123, 12.3455, new Date());
        Assertions.assertNotNull(orderLocation);
    }

    @Test
    public void test_order_location_id() {
        Long id = new Long(123456);
        orderLocation.setId(id);
        Assertions.assertEquals(orderLocation.getId(), id);
    }

    @Test
    public void test_order_location_latitude() {
        Double latitude = 13.454566;
        orderLocation.setLatitude(latitude);
        Assertions.assertEquals(orderLocation.getLatitude(), latitude);
    }

    @Test
    public void test_order_location_longitude() {
        Double longitude = 13.454566;
        orderLocation.setLongitude(longitude);
        Assertions.assertEquals(orderLocation.getLongitude(), longitude);
    }

    @Test
    public void test_order_location_date() {
        Date date = new Date();
        orderLocation.setDate(date);
        Assertions.assertEquals(orderLocation.getDate(), date);
    }
}