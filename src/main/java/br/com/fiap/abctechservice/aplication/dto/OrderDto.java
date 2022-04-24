package br.com.fiap.abctechservice.aplication.dto;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderDto {
  
	@NotNull
    @Positive
    private Long operatorId;
    @NotEmpty
    @NotNull
    private List<Long> services;
    private OrderLocationDto start;
    private OrderLocationDto end;


}