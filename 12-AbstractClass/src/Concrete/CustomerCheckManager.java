package Concrete;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	
	public boolean CheckIfRealPerson(Customer customer) {   //MernisServiceReference.KPSPublicSoapClient client = new KPSPublicSoapClient();
													    	//b�yle yaparsak web sitede s�k�nt� olursa bizde s�k�nt� ya�ar�z. Bu y�zden;
															//bir adapt�re ihtiya� var.. yeni klas�r olu�turuyoruz..(Adapters)

		return true;
		
	}

}
