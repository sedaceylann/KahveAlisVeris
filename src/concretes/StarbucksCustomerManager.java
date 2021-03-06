package concretes;

import abstracts.CustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	CustomerCheckService customerCheckService;
	
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}


	@Override
	public void save(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Starbucks müşterisi olarak eklendi:  " + customer.getFirstName());
			
		}
		else {
			System.out.println("Müşteri bilgileri doğrulanmadı!");
		}
		
	}
}
