package Implementation;

public class Utils {
	public static void runLoggers(Logger [] loggers,String message) {//statik ekledim newlememek için
		//kullanýp atmaya yani newlemeye gerek yok çünkü sürekli loglama iþi olacaðý için statik yaptýk.
		for(Logger logger:loggers) {//çoklu olduðu taktirde for ile gezmek durumundayým.
			logger.log(message);
		}
	}
}
