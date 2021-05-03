package Implementation;

public class LogManager {

	public void log(int logType) {

		if (logType == 1) {
			System.out.println("Dosyaya loglandý");
		} else if (logType == 2) {
			System.out.println("Database'e loglandý");
		} else {
			System.out.println("emaile gönderildi");
		}
	}

}
//1-file
//2-database
//3-email