package Implementation;

public class Worker implements IWorkable,IPayable, IEatable {

	@Override
	public void eat() {
		System.out.println("kurum çalýþaný olarak öðle yemeðimi afiyetle yedim");
		
	}

	@Override
	public void pay() {
		System.out.println("kurum çalýþan olarak maaþýmý aldým");
		
	}

	@Override
	public void work() {
		System.out.println("kurum çalýþaný olarak çalýþtým");
		
	}

}
