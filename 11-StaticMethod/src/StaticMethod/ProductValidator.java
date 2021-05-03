package StaticMethod;

public class ProductValidator {
	
	static {
		System.out.println("static yapýcý block çalýþtý");//c# dan farklý olarak newlenmeyen classlarda yapýcý blok çalýþmaz. bunun için ayrýca static yapýcý blok vardýr javada
		
	}
	
	public ProductValidator() { // eper statik olmayan baþka bir metot olursa ve biz bu sýnýfý newlersek ancak o zaman bu constructor çalýþýr.
		System.out.println("yapýcý block çalýþtý");
	}
	
	
	public static boolean isValid(Product product) {
		
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
		
	}

}
