package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager { // BaseCustomerManager'deki save() metodunu kullanmak için

	ICustomerCheckService customerCheckService; // checkservisdeki checkifrealperson metodunu eriþmek istiyorum.

	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {   // constructor'a ICustomerCheckService enjekte ediyorum
																					// çünkü mernisteki CheckIFRealPerson metoduna eriþmek istiyorum.
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {

		if (customerCheckService.CheckIfRealPerson(customer) == true) {

			System.out.println("STARBUCKS Management System:");
			System.out.println("Kimlik Doðrulama baþarýlý!");
			super.save(customer);//super yazmazsak recursive döngüye girer.

		} else {

			System.out.println("Starbucks Manager : Doðrulama hatalý - kiþi eklenemedi! ");
		}

	}
}