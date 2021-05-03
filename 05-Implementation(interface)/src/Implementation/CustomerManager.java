package Implementation;

public class CustomerManager {
	private Logger[] loggers;//c# ta _ ile veriyorduk deðiþken ismini
	
	public CustomerManager(Logger[] loggers) {
		super();
		this.loggers = loggers;
	}
	
	

	public void add(Customer customer) {
		
		System.out.println("müþteri eklendi "+customer.getFirstName());
		//this.logger.log(customer.getFirstName());//bir tane logger için yazdýðýmýz satýr
		
		
		Utils.runLoggers(loggers, customer.getFirstName());//önce newlemiþtik sonra static yaptýk utilsi
		
	}
	
	public void delete(Customer customer) {
		System.out.println("müþteri silindi "+customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	
	public void addMultiple(Customer customer) {
		
	}
	
		
}	
