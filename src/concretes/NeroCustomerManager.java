package concretes;

import entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	@Override
	public void save(Customer customer) {
		System.out.println("Nero müþterisi olarak kaydedildi: " + customer.getFirstName());
		
	}
}
