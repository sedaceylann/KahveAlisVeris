import concretes.BaseCustomerManager;
import concretes.NeroCustomerManager;
import concretes.StarbucksCustomerManager;
import entities.Customer;
import adapters.MernisServiceAdapter;

public class Main {

	public static void main(String[] args) {
		
			BaseCustomerManager customerManager1 = new StarbucksCustomerManager(new MernisServiceAdapter());
			BaseCustomerManager customerManager2 = new NeroCustomerManager();

			Customer customer = new Customer(1, "Berfin", "Çýnar", "1997.12.08", "85967412356");
			
			customerManager1.save(customer);
			customerManager2.save(customer);
			
			//
			
			BaseCustomerManager customerManager3 = new StarbucksCustomerManager (new MernisServiceAdapter());
			BaseCustomerManager customerManager4 = new NeroCustomerManager();
			
			Customer customer2 = new Customer(2, "Seda", "Ceylan", "1998.01.05", "58963214568");
			
			customerManager3.save(customer2);
			customerManager4.save(customer2);
			
			//
			
			BaseCustomerManager customerManager5 = new StarbucksCustomerManager (new MernisServiceAdapter());
			BaseCustomerManager customerManager6 = new NeroCustomerManager();
			
			Customer customer3 = new Customer(3, "Bedirhan", "Özdemir", "1994.07.16", "53264189652");
			
			customerManager5.save(customer3);
			customerManager6.save(customer3);
			
		}

	}


