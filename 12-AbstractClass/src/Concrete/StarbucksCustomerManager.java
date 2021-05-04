package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager { // BaseCustomerManager'deki save() metodunu kullanmak i�in

	ICustomerCheckService customerCheckService; // checkservisdeki checkifrealperson metodunu eri�mek istiyorum.

	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {   // constructor'a ICustomerCheckService enjekte ediyorum
																					// ��nk� mernisteki CheckIFRealPerson metoduna eri�mek istiyorum.
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {

		if (customerCheckService.CheckIfRealPerson(customer) == true) {

			System.out.println("STARBUCKS Management System:");
			System.out.println("Kimlik Do�rulama ba�ar�l�!");
			super.save(customer);//super yazmazsak recursive d�ng�ye girer.

		} else {

			System.out.println("Starbucks Manager : Do�rulama hatal� - ki�i eklenemedi! ");
		}

	}
}