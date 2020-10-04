/*
 * Christian Tapnio
 * 991359879
 * Assignment 2
 */
package ca.sheridancollege.tapnioc.controller;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ca.sheridancollege.tapnioc.beans.Order;
import ca.sheridancollege.tapnioc.repositories.OrderList;

@Controller
public class OrderController {

	List<Order> orderList = new CopyOnWriteArrayList<>();

	@GetMapping("/")
	public String goHome(Model model) {
		model.addAttribute("order", new Order());
		return "index";
	}

	@PostMapping("/addOrder")
	public String addOrder(Model model, @ModelAttribute Order order) {
		orderList.add(order);
		model.addAttribute("order", new Order());
		model.addAttribute("OrderList", orderList);
		return "index";
	}

	@PostMapping("/getOrder")
	public String getOrder(Model model, @ModelAttribute Order order) {
		model.addAttribute("order", new Order());
		model.addAttribute("OrderList", orderList);
		return "Checkout";
	}

	@PostMapping("/clearOrder")
	public String clearOrder(Model model, @ModelAttribute Order order) {
		orderList.clear();
		model.addAttribute("order", new Order());
		model.addAttribute("OrderList", orderList);
		return "index";
	}

	public OrderController(OrderList orderList) {
		super();
	}

}
