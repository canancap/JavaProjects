package Adapters;

import Abstract.ICustomerCheckService;
import Entities.Customer;


public class FakeCustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}
}