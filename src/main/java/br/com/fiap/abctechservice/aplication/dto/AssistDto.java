package br.com.fiap.abctechservice.aplication.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AssistDto {
    public AssistDto(Long id2, String name2, String description2) {
	}
	private Long id;
    private String name;
    private String description;
}
