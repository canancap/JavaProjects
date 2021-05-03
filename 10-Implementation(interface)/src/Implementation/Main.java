package Implementation;
// SOLID prensiplerinden "Interface Segregeation" kural�n�n yani interfacelerin par�alanmas�n� anlatan g�zel bir �rnek

public class Main {

	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.work();
		System.out.println("-------------------");
		Worker worker = new Worker();
		worker.eat();
		worker.pay();
		worker.work();
		System.out.println("-------------------");
		OutsourceWorker outsourceWorker = new OutsourceWorker();
		outsourceWorker.work();
		outsourceWorker.pay();
		

	}

}
