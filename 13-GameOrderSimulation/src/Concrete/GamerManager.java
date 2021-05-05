package Concrete;

import Abstract.BaseUserManager;
import Abstract.IGamerCheckService;
import Entities.Gamer;

public class GamerManager extends BaseUserManager{
	
	
	IGamerCheckService gamerCheckService;
	
	public GamerManager(IGamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
		
	}

	@Override
	public void signUp(Gamer gamer) {
		
		if(gamerCheckService.CheckIfRealPerson(gamer)) {
			System.out.println("Kimlik Doðrulama Baþarýlý!");
			super.signUp(gamer);//super demezsek rekursive döngüye girer
			System.out.println("Merhaba, "+ gamer.getFirstName()+ "! Kaydýn baþarýyla gerçekleþmiþtir.");
		}else {
		System.out.println("Oyuncu bilgileri mernis ile eþleþmemektedir.");
		}
	}

	@Override
	public void update() {
		System.out.println("Oyuncu bilgileri güncellendi");
		
	}

	@Override
	public void delete() {
		System.out.println("Oyuncu sistemden silindi");
		
	}

}
