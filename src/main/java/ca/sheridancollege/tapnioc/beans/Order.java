/*
 * Christian Tapnio
 * 991359879
 * Assignment 2
 */
package ca.sheridancollege.tapnioc.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9930775435577170L;
	private Long productId;
	private String productName;
	private double productPrice;
	private int quantity;

}