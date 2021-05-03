package AbstractClass;

public class Main {

	public static void main(String[] args) {
		
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		//GameCalculator gameCalculator = new KidsGameCalculator();//abstract class new'lenmez ama alt sýnýflarýnýn referansýný tuttuðu için onlarý new'leyebilir.
		

	}

}
