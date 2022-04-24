package br.com.fiap.abctechservice.aplication.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fiap.abctechservice.aplication.AssistanceApplication;
import br.com.fiap.abctechservice.aplication.dto.AssistDto;
import br.com.fiap.abctechservice.model.Assistance;
import br.com.fiap.abctechservice.service.AssistanceService;

@Component
public class AssistanceApplicationImpl implements AssistanceApplication {

	private final AssistanceService assistanceService;

	public AssistanceApplicationImpl(@Autowired AssistanceService assistanceService) {
		this.assistanceService = assistanceService;
	}

	@Override
	public List<AssistDto> getAssists() {
		List<Assistance> listAssists = this.assistanceService.getAssistsList();
		return listAssists.stream()
				.map(assistance -> new AssistDto(assistance.getId(), assistance.getName(), assistance.getDescription()))
				.collect(Collectors.toList());
	}
}
