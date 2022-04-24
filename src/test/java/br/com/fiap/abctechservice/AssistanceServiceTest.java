package br.com.fiap.abctechservice;

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

import static org.mockito.Mockito.*;

@SpringBootTest
public class AssistanceServiceTest {

	@Mock
	private AssistanceRepository assistanceRepository;
	private AssistanceService assistanceService;

	@BeforeEach
	public void init() {
		MockitoAnnotations.openMocks(this);
		assistanceService = new AssistanceServiceImpl(assistanceRepository);
	}

	@Test
	public void test_list_success() {
		Assistance itemAssist = new Assistance(1L, "Mock Name", "Mock Description");
		Assistance itemAssist2 = new Assistance(2L, "Mock Name 2", "Mock Description 2");

		when(assistanceRepository.findAll()).thenReturn(List.of(itemAssist, itemAssist2));

		List<Assistance> values = assistanceService.getAssistsList();

		Assertions.assertEquals(values.size(), 2);
		Assertions.assertSame(values.get(0), itemAssist);
		Assertions.assertSame(values.get(1), itemAssist2);
	}

	@Test
	public void test_list_empty() {
		when(assistanceRepository.findAll()).thenReturn(List.of());

		List<Assistance> values = assistanceService.getAssistsList();

		Assertions.assertEquals(values.size(), 0);
	}
}
