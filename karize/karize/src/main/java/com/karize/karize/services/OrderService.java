package com.karize.karize.services;

import org.springframework.stereotype.Service;

import com.karize.karize.entities.Order;
@Service
public class OrderService {
	
	 private Order order;
	    private ShippingService shipp;

	    public Double total(Order order) {
	        ShippingService shipp = new ShippingService();
	        return order.getBasic() - (order.getBasic() * (order.getDiscount() / 100)) + shipp.shippiment(order);
	    }
	;


}
