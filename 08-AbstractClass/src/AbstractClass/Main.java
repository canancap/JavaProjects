package AbstractClass;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new OracleDatabaseManager();// strateji belirliyoruz.hangi db.
																	  // müşteri farklı db isterse sadece burayı değiştirmek yeterli oluyor.
		customerManager.getCustomers();
	}

}
