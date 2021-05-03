package Concrete;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	
	public boolean CheckIfRealPerson(Customer customer) {   //MernisServiceReference.KPSPublicSoapClient client = new KPSPublicSoapClient();
													    	//böyle yaparsak web sitede sýkýntý olursa bizde sýkýntý yaþarýz. Bu yüzden;
															//bir adaptöre ihtiyaç var.. yeni klasör oluþturuyoruz..(Adapters)

		return true;
		
	}

}
