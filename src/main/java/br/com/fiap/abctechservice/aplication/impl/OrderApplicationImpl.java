package br.com.fiap.abctechservice.aplication.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fiap.abctechservice.aplication.OrderApplication;
import br.com.fiap.abctechservice.aplication.dto.OrderDto;
import br.com.fiap.abctechservice.aplication.dto.OrderLocationDto;
import br.com.fiap.abctechservice.model.Order;
import br.com.fiap.abctechservice.model.OrderLocation;
import br.com.fiap.abctechservice.service.OrderService;

@Component
public class OrderApplicationImpl implements OrderApplication {

	private final OrderService orderService;

	public OrderApplicationImpl(@Autowired OrderService orderService) {
		this.orderService = orderService;
	}

	@Override
	public void createOrder(OrderDto orderDto) {
		Order order = new Order();
		order.setOperatorId(orderDto.getOperatorId());
		order.setStartOrderLocation(getOrderLocationFromOrderLocationDto(orderDto.getStart()));
		order.setEndOrderLocation(getOrderLocationFromOrderLocationDto(orderDto.getEnd()));

		this.orderService.saveOrder(order, orderDto.getServices());
	}

	private OrderLocation getOrderLocationFromOrderLocationDto(OrderLocationDto orderLocationDto) {
		OrderLocation location = new OrderLocation();
		location.setLatitude(orderLocationDto.getLatitude());
		location.setLongitude(orderLocationDto.getLatitude());
		location.setDate(orderLocationDto.getDateTime());
		return location;
	}
}
