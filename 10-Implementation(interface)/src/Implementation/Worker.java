package Implementation;

public class Worker implements IWorkable,IPayable, IEatable {

	@Override
	public void eat() {
		System.out.println("kurum �al��an� olarak ��le yeme�imi afiyetle yedim");
		
	}

	@Override
	public void pay() {
		System.out.println("kurum �al��an olarak maa��m� ald�m");
		
	}

	@Override
	public void work() {
		System.out.println("kurum �al��an� olarak �al��t�m");
		
	}

}
