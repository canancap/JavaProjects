package AbstractClass;

public class MenGameCalculator extends GameCalculator {
	@Override   // override yazmasan da ezebilirsin ancak kodun okunurluðu açýsýndan yazmak iyi
				// olur. bakan þunu der.demek ki hesapla metodu base classda mevcut.
	public void hesapla() {
		// override ederek farklý bir oyun algoritamasý yazýyorum men için.default
		// hesaplamayý istemiyorum
		System.out.println("Puanýnýz: 90");
	}
}
