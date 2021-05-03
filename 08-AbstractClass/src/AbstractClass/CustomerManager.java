package AbstractClass;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager;
	public void getCustomers() {
		databaseManager.getData();
	}

}
