package Overriding;

public class Main {

	public static void main(String[] args) {
		
		BaseKrediManager [] basekrediler = new BaseKrediManager[] 
				{new OgrenciKrediManager(),new TarimKrediManager()};
		
		for(BaseKrediManager basekredi:basekrediler) {
			System.out.println(basekredi.hesapla(1000));
			
			//basede default olarak override edilebilir. 
			//yani her manager i�indeki farkl� farkl� hesapla metotlar� �al��t�r�labilir.ama e�er 
			//sadece base deki hesapla fonksiyonunun kullan�lmas�n� istersem basedeki hesaplay� final keywordu yazmal�y�m.
		}
	}

}
