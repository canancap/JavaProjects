package StaticMethod;

public class DatabaseHelper { //best practice olarak bu þekilde çalýþmak uygun deðil.SOLID'in Single Responsibility kuralýna aykýrý. databasehelper clasýnýn birden fazla görevi var.bu yazýlým prensiplerine aykýrý
	//inner class uygulamasý.bir class içinde static class yazabiliyoruz. ancak c#'da ana classý static yapabiliyorum.
	
	public static class Crud {
		
		public static void Delete() {
			System.out.println("inner static class çalýþtý");
			
		}
		public static void Update() {
			
		}
		
	}
	
	public static class Connection{
		public static void CreateConnection() {
			
		}
		
	}

}
