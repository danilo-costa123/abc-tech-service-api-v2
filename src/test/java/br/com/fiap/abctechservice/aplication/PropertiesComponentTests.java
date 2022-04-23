package br.com.fiap.abctechservice.aplication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PropertiesComponentTests {
    private PropertiesComponent propertiesComponent;

    @BeforeEach
    void setUp() {
        propertiesComponent = new PropertiesComponent();
    }
    @Test
    void testingGetName() {
        Assertions.assertNotNull(propertiesComponent.getName());
        Assertions.assertEquals("abc-tech-service", propertiesComponent.getName());
    }

    @Test
    void testingGetVersion() {
        Assertions.assertNotNull(propertiesComponent.getVersion());
    }


}
