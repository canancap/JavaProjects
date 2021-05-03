package StaticMethod;

public class ProductValidator {
	
	static {
		System.out.println("static yap�c� block �al��t�");//c# dan farkl� olarak newlenmeyen classlarda yap�c� blok �al��maz. bunun i�in ayr�ca static yap�c� blok vard�r javada
		
	}
	
	public ProductValidator() { // eper statik olmayan ba�ka bir metot olursa ve biz bu s�n�f� newlersek ancak o zaman bu constructor �al���r.
		System.out.println("yap�c� block �al��t�");
	}
	
	
	public static boolean isValid(Product product) {
		
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
		
	}

}
