package br.com.fiap.abctechservice.aplication.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderLocationDto {

    private Double latitude;
    private Double longitude;
    private Date dateTime;
}