package br.com.fiap.abctechservice.aplication.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderDto {
  
    private Long operatorId;  
    private List<Long> services;
    private OrderLocationDto start;
    private OrderLocationDto end;


}