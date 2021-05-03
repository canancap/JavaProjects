package StaticMethod;

public class DatabaseHelper { //best practice olarak bu �ekilde �al��mak uygun de�il.SOLID'in Single Responsibility kural�na ayk�r�. databasehelper clas�n�n birden fazla g�revi var.bu yaz�l�m prensiplerine ayk�r�
	//inner class uygulamas�.bir class i�inde static class yazabiliyoruz. ancak c#'da ana class� static yapabiliyorum.
	
	public static class Crud {
		
		public static void Delete() {
			System.out.println("inner static class �al��t�");
			
		}
		public static void Update() {
			
		}
		
	}
	
	public static class Connection{
		public static void CreateConnection() {
			
		}
		
	}

}
