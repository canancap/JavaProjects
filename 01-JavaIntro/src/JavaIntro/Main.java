package JavaIntro;



public class Main {

	public static void main(String[] args) {

		String internetSubeButonu = "�nternet �ubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.10;
		//int vade = 36;
		// boolean dustuMu = false;
		System.out.println(internetSubeButonu);

		if (dolarBugun < dolarDun) {
			System.out.println("Dolar d��t� resmi");
		} else if (dolarBugun > dolarDun) {
			System.out.println("Dolar y�kseldi resmi");
		} else {
			System.out.println("Dolar e�ittir resmi");
		}

		System.out.println("-----------------------------");
		
		String kredi2 = "Mutlu Emekli Kredisi";
		String[] krediler = { "H�zl� Kredi", kredi2 };

		// foreach
		for (String kredi : krediler) {
			System.out.println(kredi);
		}
		// saya� g�d�ml� d�ng�
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
			if (maximum < sayi) { // en b�y�k say�y� buldum
				maximum = sayi;
			}
			sum = sum + sayi;
			System.out.println("dizide yer alan say�lar:" + sayi);
		}
		System.out.println("dizinin toplam�: " + sum);
		System.out.println("en b�y�k say�: " + maximum);
		System.out.println("-----------------------------");

		// if bloklar�yla en b�y�k say�y� bulma
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
		System.out.println("en b�y�k say�: " + max);
		System.out.println("-----------------------------");

		// switch kullanma.if e g�re daha az kullan�l�r.s�nav notu verme

		char grade = 'A';
		switch (grade) {// �art�m�z�n �znesi
		case 'A':
			System.out.println("Ge�tiniz");
			break;
		case 'B':
			System.out.println("�ok iyi");
			break;
		case 'C':
		case 'D':
			System.out.println("idare eder");
			break;
		default:
			System.out.println("ge�ersiz not girdiniz");
		}
		System.out.println("-----------------------------");
		// while d�ng�s�
		int i = 1;
		while (i < 10) { // infinite loop'a girer e�er 1 art�rmazsak
			System.out.println(i);
			i++;
		}
		System.out.println("-----------------------------");
		// do-while d�ng�s�
		int j = 1;
		do {
			System.out.println(j);
			j += 2;
		} while (j < 10);
		System.out.println("d�ng� bitti");

		// matrix yap�s� i�in �oklu arrayler kullan�l�r = multi dimensional diziler
		String sehirler[][] = new String[3][3];
		sehirler[0][0] = "�stanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "�anakkale";
		sehirler[1][0] = "Rize";
		sehirler[1][1] = "Mu�";
		sehirler[1][2] = "D�zce";

		for (int x = 0; x <= 1; x++) {
			System.out.println("------------");
			for (int y = 0; y <= 1; y++) {
				System.out.println(sehirler[x][y]);
			}
		}
		System.out.println("-----------------");
		String mesaj = "Bug�n hava �ok g�zel.";// strings are character arrays
		System.out.println("Eleman say�s�: " + mesaj.length());
		System.out.println("5. Eleman: " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Ya�as�n!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);// karakterler bo� dizisi i�ine mesaj stringinin ilk 5 karakterini ata
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("a"));// ilk rastlad���n a karakterinin indexini ver
		System.out.println(mesaj.lastIndexOf("a"));// son rastlad���n a karakterinin indexini ver

		System.out.println(mesaj.replace(' ', '-'));
		System.out.println(mesaj.substring(2)); // bir metnin i�inden par�a almak
		System.out.println(mesaj.substring(2, 5));// 2.indexten ba�la 5.indexe kadar ama 5 hari�tir.

		for (String kelime : mesaj.split(" ")) { // bo�luklara g�re metni par�ala
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());// trim ile ifadenin ba��ndaki sonundaki bo�luklar� atar�z

		// Asal Say�y� bulma 1. Y�ntem
		int sayi = 66;

		int kalan1 = sayi % 2;
		int kalan2 = sayi % 3;
		int kalan3 = sayi % 5;
		if (kalan1 != 0 && kalan2 != 0 && kalan3 != 0) {
			System.out.println(sayi + " asaldir");
		} else {
			System.out.println(sayi + " asal de�ildir");
		}

		// Asal say� bulma 2. y�ntem
		if (sayi == 1) {
			System.out.println(sayi + " asal de�ildir");
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
			System.out.println(sayi + " asal de�ildir");
		}

		// ince ve kal�n sesli harfleri bulma
		char harf = 'E';
		switch (harf) {
		case 'A':
		case 'O':
		case 'I':
		case 'U':
			System.out.println("kal�n sesli harf girilmi�tir");
			break;
		default:
			System.out.println("ince sesli harf girilmi�tir");

		}

		// birden fazla say�n�n toplanmas�
		int toplam = topla(2, 3, 4, 5);
		System.out.println(toplam);

	}

	public static int topla(int... sayilar) {//test edilebilirli�i zay�f ondan �ok kullan��maz.buraya bir nesne g�nderilse onu kontrol etmek zor. bunun yerine collektionlar� kullanmak daha iyi.
		int topl = 0;
		for (int sayi : sayilar) {
			topl = topl + sayi;
		}
		return topl;
	}
}

