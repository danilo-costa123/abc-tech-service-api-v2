package br.com.fiap.abctechservice.aplication;

import br.com.fiap.abctechservice.aplication.dto.AssistDto;
import br.com.fiap.abctechservice.aplication.impl.AssistanceApplicationImpl;
import br.com.fiap.abctechservice.model.Assistance;
import br.com.fiap.abctechservice.repository.AssistanceRepository;
import br.com.fiap.abctechservice.service.AssistanceService;
import br.com.fiap.abctechservice.service.impl.AssistanceServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.mockito.Mockito.when;

@SpringBootTest
public class AssistanceApplicationTests {
   @Mock
    private AssistanceRepository assistanceRepository;
    private AssistanceService assistanceService;
    private AssistanceApplication assistanceApplication;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
        assistanceService = new AssistanceServiceImpl(assistanceRepository);
        assistanceApplication = new AssistanceApplicationImpl(assistanceService);
    }

    @Test
    public void test_assistance_application_success(){
        Assistance itemAssist = new Assistance(1L, "Mock Name", "Mock Description");
        Assistance itemAssist2 = new Assistance(2L, "Mock Name 2", "Mock Description 2");

        when(assistanceRepository.findAll()).thenReturn(List.of(itemAssist,itemAssist2));

        List<AssistDto> values = assistanceApplication.getAssists();

        Assertions.assertEquals(values.size(), 2);
    }

    @Test
    public void test_assistance_application_empty(){
        when(assistanceRepository.findAll()).thenReturn(List.of());

        List<AssistDto> values = assistanceApplication.getAssists();

        Assertions.assertEquals(values.size(), 0);
    }
}