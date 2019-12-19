package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Customer;
import model.Order;

public class OrderService {
	private Map<String, Order> orderMap;

	public OrderService(Order order) {
		orderMap = new HashMap<String, Order>();
		addOrder(order);

	}

	private void addOrder(Order order) {
		orderMap.put(order.getCardNum(), order);
	}

}
