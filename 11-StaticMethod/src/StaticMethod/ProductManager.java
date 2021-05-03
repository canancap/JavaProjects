package StaticMethod;

public class ProductManager {
	public void add(Product product) {

		if (ProductValidator.isValid(product)) {    // isvalid() metodunu static yapt���m�z i�in clas�n�
													// newlemeden ona ula�abiliyoruz. yard�mc� ara�lar, kullan b�rak
													// ara�larda bu iyi oluyor.
													// t�m classlar� static yapmay�z ��nk� newlenen class ile i�in
													// bitti�inde o nesne at�l�r.
													// bellekte art�k yer kaplamaz.ama statik metodun class� program
													// �al���nca otomatik olu�ur ve program kapan�ncaya kadar bellekte
													// yer tutar.pahal� bir uygulamad�r yani.
			System.out.println("�r�n eklendi");
		} else {
			System.out.println("�r�n bilgileri ge�ersizdir");
		}

	}
}
