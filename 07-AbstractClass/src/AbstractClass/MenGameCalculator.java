package AbstractClass;

public class MenGameCalculator extends GameCalculator {
	@Override   // override yazmasan da ezebilirsin ancak kodun okunurlu�u a��s�ndan yazmak iyi
				// olur. bakan �unu der.demek ki hesapla metodu base classda mevcut.
	public void hesapla() {
		// override ederek farkl� bir oyun algoritamas� yaz�yorum men i�in.default
		// hesaplamay� istemiyorum
		System.out.println("Puan�n�z: 90");
	}
}
