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
			System.out.println("Kimlik Do�rulama Ba�ar�l�!");
			super.signUp(gamer);//super demezsek rekursive d�ng�ye girer
			System.out.println("Merhaba, "+ gamer.getFirstName()+ "! Kayd�n ba�ar�yla ger�ekle�mi�tir.");
		}else {
		System.out.println("Oyuncu bilgileri mernis ile e�le�memektedir.");
		}
	}

	@Override
	public void update() {
		System.out.println("Oyuncu bilgileri g�ncellendi");
		
	}

	@Override
	public void delete() {
		System.out.println("Oyuncu sistemden silindi");
		
	}

}
