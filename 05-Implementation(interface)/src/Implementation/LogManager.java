package Implementation;

public class LogManager {

	public void log(int logType) {

		if (logType == 1) {
			System.out.println("Dosyaya logland�");
		} else if (logType == 2) {
			System.out.println("Database'e logland�");
		} else {
			System.out.println("emaile g�nderildi");
		}
	}

}
//1-file
//2-database
//3-email