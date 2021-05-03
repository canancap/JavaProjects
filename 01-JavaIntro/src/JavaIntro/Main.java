package JavaIntro;



public class Main {

	public static void main(String[] args) {

		String internetSubeButonu = "Ýnternet Þubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.10;
		//int vade = 36;
		// boolean dustuMu = false;
		System.out.println(internetSubeButonu);

		if (dolarBugun < dolarDun) {
			System.out.println("Dolar düþtü resmi");
		} else if (dolarBugun > dolarDun) {
			System.out.println("Dolar yükseldi resmi");
		} else {
			System.out.println("Dolar eþittir resmi");
		}

		System.out.println("-----------------------------");
		
		String kredi2 = "Mutlu Emekli Kredisi";
		String[] krediler = { "Hýzlý Kredi", kredi2 };

		// foreach
		for (String kredi : krediler) {
			System.out.println(kredi);
		}
		// sayaç güdümlü döngü
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

		System.out.println("-----------------------------");
		double[] sayilar = new double[2];
		sayilar[0] = 45.5;
		sayilar[1] = 70.6;
		double maximum = sayilar[0];
		double sum = 0.0;
		for (double sayi : sayilar) {
			if (maximum < sayi) { // en büyük sayýyý buldum
				maximum = sayi;
			}
			sum = sum + sayi;
			System.out.println("dizide yer alan sayýlar:" + sayi);
		}
		System.out.println("dizinin toplamý: " + sum);
		System.out.println("en büyük sayý: " + maximum);
		System.out.println("-----------------------------");

		// if bloklarýyla en büyük sayýyý bulma
		int a = 3;
		int b = 2;
		int c = 1;
		int max = a;
		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		System.out.println("en büyük sayý: " + max);
		System.out.println("-----------------------------");

		// switch kullanma.if e göre daha az kullanýlýr.sýnav notu verme

		char grade = 'A';
		switch (grade) {// þartýmýzýn öznesi
		case 'A':
			System.out.println("Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok iyi");
			break;
		case 'C':
		case 'D':
			System.out.println("idare eder");
			break;
		default:
			System.out.println("geçersiz not girdiniz");
		}
		System.out.println("-----------------------------");
		// while döngüsü
		int i = 1;
		while (i < 10) { // infinite loop'a girer eðer 1 artýrmazsak
			System.out.println(i);
			i++;
		}
		System.out.println("-----------------------------");
		// do-while döngüsü
		int j = 1;
		do {
			System.out.println(j);
			j += 2;
		} while (j < 10);
		System.out.println("döngü bitti");

		// matrix yapýsý için çoklu arrayler kullanýlýr = multi dimensional diziler
		String sehirler[][] = new String[3][3];
		sehirler[0][0] = "Ýstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Çanakkale";
		sehirler[1][0] = "Rize";
		sehirler[1][1] = "Muþ";
		sehirler[1][2] = "Düzce";

		for (int x = 0; x <= 1; x++) {
			System.out.println("------------");
			for (int y = 0; y <= 1; y++) {
				System.out.println(sehirler[x][y]);
			}
		}
		System.out.println("-----------------");
		String mesaj = "Bugün hava çok güzel.";// strings are character arrays
		System.out.println("Eleman sayýsý: " + mesaj.length());
		System.out.println("5. Eleman: " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaþasýn!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);// karakterler boþ dizisi içine mesaj stringinin ilk 5 karakterini ata
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("a"));// ilk rastladýðýn a karakterinin indexini ver
		System.out.println(mesaj.lastIndexOf("a"));// son rastladýðýn a karakterinin indexini ver

		System.out.println(mesaj.replace(' ', '-'));
		System.out.println(mesaj.substring(2)); // bir metnin içinden parça almak
		System.out.println(mesaj.substring(2, 5));// 2.indexten baþla 5.indexe kadar ama 5 hariçtir.

		for (String kelime : mesaj.split(" ")) { // boþluklara göre metni parçala
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());// trim ile ifadenin baþýndaki sonundaki boþluklarý atarýz

		// Asal Sayýyý bulma 1. Yöntem
		int sayi = 66;

		int kalan1 = sayi % 2;
		int kalan2 = sayi % 3;
		int kalan3 = sayi % 5;
		if (kalan1 != 0 && kalan2 != 0 && kalan3 != 0) {
			System.out.println(sayi + " asaldir");
		} else {
			System.out.println(sayi + " asal deðildir");
		}

		// Asal sayý bulma 2. yöntem
		if (sayi == 1) {
			System.out.println(sayi + " asal deðildir");
			return;// program burada bitsin diye.
		}

		boolean isPrime = true;
		for (int s = 2; s < sayi; s++) {
			if (sayi % s == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println(sayi + " asaldir");
		} else {
			System.out.println(sayi + " asal deðildir");
		}

		// ince ve kalýn sesli harfleri bulma
		char harf = 'E';
		switch (harf) {
		case 'A':
		case 'O':
		case 'I':
		case 'U':
			System.out.println("kalýn sesli harf girilmiþtir");
			break;
		default:
			System.out.println("ince sesli harf girilmiþtir");

		}

		// birden fazla sayýnýn toplanmasý
		int toplam = topla(2, 3, 4, 5);
		System.out.println(toplam);

	}

	public static int topla(int... sayilar) {//test edilebilirliði zayýf ondan çok kullanýþmaz.buraya bir nesne gönderilse onu kontrol etmek zor. bunun yerine collektionlarý kullanmak daha iyi.
		int topl = 0;
		for (int sayi : sayilar) {
			topl = topl + sayi;
		}
		return topl;
	}
}

