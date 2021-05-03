package Overriding;

public class Main {

	public static void main(String[] args) {
		
		BaseKrediManager [] basekrediler = new BaseKrediManager[] 
				{new OgrenciKrediManager(),new TarimKrediManager()};
		
		for(BaseKrediManager basekredi:basekrediler) {
			System.out.println(basekredi.hesapla(1000));
			
			//basede default olarak override edilebilir. 
			//yani her manager içindeki farklı farklı hesapla metotları çalıştırılabilir.ama eğer 
			//sadece base deki hesapla fonksiyonunun kullanılmasını istersem basedeki hesaplayı final keywordu yazmalıyım.
		}
	}

}
