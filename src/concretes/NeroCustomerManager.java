package concretes;

import entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	@Override
	public void save(Customer customer) {
		System.out.println("Nero m��terisi olarak kaydedildi: " + customer.getFirstName());
		
	}
}
