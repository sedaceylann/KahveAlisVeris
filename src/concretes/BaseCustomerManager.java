package concretes;

import abstracts.CustomerService;
import entities.Customer;

public abstract class BaseCustomerManager implements CustomerService  {
	@Override
	public void save(Customer customer) {
		System.out.println("M��teri Eklendi: " + customer.getFirstName());
		
	}
}
