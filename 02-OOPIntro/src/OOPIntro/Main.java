package OOPIntro;


public class Main {

	public static void main(String[] args) {
		
		//Product product1 = new Product(1,"Lenova v13",15000,"16gb ram",10);//instance olu�turma, �rnek olu�turma, referans olu�turma
																				//bu instance da ikinci constructoru kullan�yoruz. parametreli olan
		Product product2 = new Product();										//instance olu�turma, �rnek olu�turma, referans olu�turma
		product2.setId(2);														//e�ittir ile de�il de set ederek de�er veriyorum.
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
