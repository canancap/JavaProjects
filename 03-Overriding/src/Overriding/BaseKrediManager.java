package Overriding;

public class BaseKrediManager {
	
	public double hesapla(double tutar) {//final keyword�n� kullan�rsam ba�ka bir hesapla metodu ile bu metodu ezemezsin demektir. yazmazsan override edilebilir demektir.
		
		return tutar*1.18;
	}
}
