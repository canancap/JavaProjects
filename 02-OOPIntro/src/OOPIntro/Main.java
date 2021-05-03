package OOPIntro;


public class Main {

	public static void main(String[] args) {
		
		//Product product1 = new Product(1,"Lenova v13",15000,"16gb ram",10);//instance oluþturma, örnek oluþturma, referans oluþturma
																				//bu instance da ikinci constructoru kullanýyoruz. parametreli olan
		Product product2 = new Product();										//instance oluþturma, örnek oluþturma, referans oluþturma
		product2.setId(2);														//eþittir ile deðil de set ederek deðer veriyorum.
		product2.setName("Enovo 23");
		product2.setDetail("16 GB RAM");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("yiyecek");
		System.out.println(category1.getName());
	}

}
