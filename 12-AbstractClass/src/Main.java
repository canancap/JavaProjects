



import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager baseCustomerManager1 = new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager1.save(new Customer(1,"Canan", "Çap",1981,"27920468390"));
		System.out.println("--------------------");
		BaseCustomerManager baseCustomerManager2 = new NeroCustomerManager();
		baseCustomerManager2.save(new Customer(2,"Cavidan","Çamtutan",1981,"12323dd2323"));
		
	}

}
