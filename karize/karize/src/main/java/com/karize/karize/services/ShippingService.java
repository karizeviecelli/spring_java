package com.karize.karize.services;

import org.springframework.stereotype.Service;

import com.karize.karize.entities.Order;
@Service
public class ShippingService {

	  
    public Double shippiment(Order order) {
                Double valorCompra = order.getBasic();

		if (order.getBasic() < 100) {
			return 20.0;
		} else if (order.getBasic() >= 100 && order.getBasic() < 200) {
			return 12.0;
		} else {
			return 0.0;
		}
	}
}
