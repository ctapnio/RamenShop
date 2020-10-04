package ca.sheridancollege.tapnioc.repositories;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Component;

import ca.sheridancollege.tapnioc.beans.Order;
import lombok.Data;

@Component
@Data
public class OrderListImpl implements OrderList {

	private List<Order> orderList = new CopyOnWriteArrayList<Order>();

//	@Override
//	public List<Order> getOrderList() {
//		// TODO Auto-generated method stub
//		return orderList;
//	}
//
//	@Override
//	public void setOrderList(List<Order> orderList) {
//		// TODO Auto-generated method stub
//
//	}

	@Override
	public void emptyList() {
		orderList.clear();

	}

}
