package Implementation;

public class OutsourceWorker implements IWorkable,IPayable  {

	@Override
	public void pay() {
		System.out.println("ta�eron �al��an olarak maa��m� ald�m");
		
	}

	@Override
	public void work() {
		System.out.println("ta�eron �al��an olarak �al��t�m");
		
	}

}
