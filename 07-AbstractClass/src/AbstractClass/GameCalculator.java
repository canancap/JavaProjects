package AbstractClass;

public abstract class GameCalculator {
	// erkek,kadýn,çocuk olmak üzere 3 oyuncu tipi var.herbiri için farklý
	// hesaplamalar yapacaðýz.bunu if ile yapmaktansa soyutlayarak yapacaðýz. ki
	// kodlar spagetti olmasýn.

	public abstract void hesapla(); // hesapla imzasý var.gamecalculator extends eden herkes bu
									// hesapla() metodunu kullanmak zorunda ve hesaplama metotlarýný kendine göre
									// yazmak zorunda. abstract ile her extends eden bu metotdu kullanmak zorunda
									// demiþ oluyoruz.
									// abstract class kurallarý koyan konumunda olmuþ oluyor.

	public final void gameOver() {  // gamecalculator kim kullanýyorsa gameOver() override edemez,
									// ayný þekilde kullanmak zorunda. çünkü final dedim.
									// kullanmak zorunda deðilsin (çünkü abstract deðil bu metot) ama eðer
									// kullanacaksan override edemezsin
		System.out.println("Oyun bitti");
	}

}
