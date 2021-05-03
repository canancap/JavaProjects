package Implementation;

public class CustomerManager {
	private Logger[] loggers;//c# ta _ ile veriyorduk de�i�ken ismini
	
	public CustomerManager(Logger[] loggers) {
		super();
		this.loggers = loggers;
	}
	
	

	public void add(Customer customer) {
		
		System.out.println("m��teri eklendi "+customer.getFirstName());
		//this.logger.log(customer.getFirstName());//bir tane logger i�in yazd���m�z sat�r
		
		
		Utils.runLoggers(loggers, customer.getFirstName());//�nce newlemi�tik sonra static yapt�k utilsi
		
	}
	
	public void delete(Customer customer) {
		System.out.println("m��teri silindi "+customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	
	public void addMultiple(Customer customer) {
		
	}
	
		
}	
