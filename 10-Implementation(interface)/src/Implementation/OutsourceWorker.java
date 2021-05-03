package Implementation;

public class OutsourceWorker implements IWorkable,IPayable  {

	@Override
	public void pay() {
		System.out.println("taþeron çalýþan olarak maaþýmý aldým");
		
	}

	@Override
	public void work() {
		System.out.println("taþeron çalýþan olarak çalýþtým");
		
	}

}
