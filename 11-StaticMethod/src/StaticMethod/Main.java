package StaticMethod;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.name = "mouse";
		product.price = 10;
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		
		DatabaseHelper.Crud.Delete();
		DatabaseHelper.Connection.CreateConnection();

	}

}
