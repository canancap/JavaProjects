package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	ICustomerCheckService customerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {

		if (customerCheckService.CheckIfRealPerson(customer) == true) {
			System.out.println("Starbucks Manager : Dogrulama basarili.");
			super.save(customer);
			
		} else {
			System.out.println("Starbucks Manager : Dogrulama hatali - kisi eklenemedi! ");
		}

	}
}