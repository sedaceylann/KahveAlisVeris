package adapters;

import abstracts.CustomerCheckService;
import entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService{
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		if (customer.getNationalityNumber().length() == 11) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
