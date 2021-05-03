package Implementation;

public class Utils {
	public static void runLoggers(Logger [] loggers,String message) {//statik ekledim newlememek i�in
		//kullan�p atmaya yani newlemeye gerek yok ��nk� s�rekli loglama i�i olaca�� i�in statik yapt�k.
		for(Logger logger:loggers) {//�oklu oldu�u taktirde for ile gezmek durumunday�m.
			logger.log(message);
		}
	}
}
