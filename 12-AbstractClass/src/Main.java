



import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.save(new Customer(1,"Canan", "Çap",1981,"27110468390"));
		
		
		
	}

}
