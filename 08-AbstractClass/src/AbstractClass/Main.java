package AbstractClass;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new OracleDatabaseManager();// strateji belirliyoruz.hangi db.
																	  // m��teri farkl� db isterse sadece buray� de�i�tirmek yeterli oluyor.
		customerManager.getCustomers();
	}

}
