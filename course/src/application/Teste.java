package application;

import java.util.Date;

import entities.TesteEntities;
import entities.enums.OrderStatus;

public class Teste {

	public static void main(String[] args) {
		
		TesteEntities order = new TesteEntities(1080, new Date(), OrderStatus.PEDING_PAYMENT);
		
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
