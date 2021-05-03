package StaticMethod;

public class ProductManager {
	public void add(Product product) {

		if (ProductValidator.isValid(product)) {    // isvalid() metodunu static yaptýðýmýz için clasýný
													// newlemeden ona ulaþabiliyoruz. yardýmcý araçlar, kullan býrak
													// araçlarda bu iyi oluyor.
													// tüm classlarý static yapmayýz çünkü newlenen class ile iþin
													// bittiðinde o nesne atýlýr.
													// bellekte artýk yer kaplamaz.ama statik metodun classý program
													// çalýþýnca otomatik oluþur ve program kapanýncaya kadar bellekte
													// yer tutar.pahalý bir uygulamadýr yani.
			System.out.println("Ürün eklendi");
		} else {
			System.out.println("Ürün bilgileri geçersizdir");
		}

	}
}
