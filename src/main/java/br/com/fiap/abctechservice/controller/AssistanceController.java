package br.com.fiap.abctechservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.abctechservice.aplication.AssistanceApplication;
import br.com.fiap.abctechservice.aplication.dto.AssistDto;

@RestController
@RequestMapping("/assistance")
public class AssistanceController {
	
	@Autowired
	private final AssistanceApplication assistanceApplication;

	public AssistanceController(@Autowired AssistanceApplication assistanceApplication) {
		this.assistanceApplication = assistanceApplication;
	}

	@GetMapping()
	public ResponseEntity<List<AssistDto>> getAssists() {
		List<AssistDto> list = this.assistanceApplication.getAssists();
		return ResponseEntity.ok(list);
	}
}
