package ca.sheridancollege.tapnioc.repositories;

import java.util.List;

import ca.sheridancollege.tapnioc.beans.Order;

public interface OrderList {
	
	public List<Order> getOrderList();

	public void setOrderList(List<Order> orderList);

	public void emptyList();
}
