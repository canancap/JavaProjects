package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;// CTRL + SHIFT + o ile package gelir 

public interface ProductService {
	
	void add(Product product);

	List<Product> getAll();

}
