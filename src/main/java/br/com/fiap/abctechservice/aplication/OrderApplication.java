package br.com.fiap.abctechservice.aplication;

import br.com.fiap.abctechservice.aplication.dto.OrderDto;

public interface OrderApplication {

    void createOrder(OrderDto orderDto);
}
