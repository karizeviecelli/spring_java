package com.karize.karize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.karize.karize.entities.Order;
import com.karize.karize.services.OrderService;
import com.karize.karize.services.ShippingService;

@SpringBootApplication
public class KarizeApplication {

	public static void main(String[] args) {
		SpringApplication.run(KarizeApplication.class, args);
		
        Order order = new Order(1309, 95.90, 0.0);
        OrderService orderService = new OrderService();
        
        ShippingService shipp = new ShippingService();

        
        System.out.println("Numero do pedido: R$ "+ order.getCode());
        System.out.println("Valor total da compra: R$ "+ orderService.total(order));
        
      
        
    
        
        
    }
    
	}


