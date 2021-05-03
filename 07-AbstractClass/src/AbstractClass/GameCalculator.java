package AbstractClass;

public abstract class GameCalculator {
	// erkek,kad�n,�ocuk olmak �zere 3 oyuncu tipi var.herbiri i�in farkl�
	// hesaplamalar yapaca��z.bunu if ile yapmaktansa soyutlayarak yapaca��z. ki
	// kodlar spagetti olmas�n.

	public abstract void hesapla(); // hesapla imzas� var.gamecalculator extends eden herkes bu
									// hesapla() metodunu kullanmak zorunda ve hesaplama metotlar�n� kendine g�re
									// yazmak zorunda. abstract ile her extends eden bu metotdu kullanmak zorunda
									// demi� oluyoruz.
									// abstract class kurallar� koyan konumunda olmu� oluyor.

	public final void gameOver() {  // gamecalculator kim kullan�yorsa gameOver() override edemez,
									// ayn� �ekilde kullanmak zorunda. ��nk� final dedim.
									// kullanmak zorunda de�ilsin (��nk� abstract de�il bu metot) ama e�er
									// kullanacaksan override edemezsin
		System.out.println("Oyun bitti");
	}

}
