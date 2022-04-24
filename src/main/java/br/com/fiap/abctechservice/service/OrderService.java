package br.com.fiap.abctechservice.service;


import br.com.fiap.abctechservice.model.Order;

import java.util.List;

public interface OrderService {
    public void saveOrder(Order order, List<Long> arrayAssists);

    List<Order> listOrdersByOperator(Long operatorId);
}
