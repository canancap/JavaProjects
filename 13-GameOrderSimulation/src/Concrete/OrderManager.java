package Concrete;

import Abstract.IOrderService;
import Entities.Camp;
import Entities.Game;
import Entities.Gamer;

public class OrderManager implements IOrderService{
	
	

	@Override
	public void order(Gamer gamer, Game game, Camp camp) {
		
		System.out.println("Say�n "+gamer.getFirstName()+" "+ gamer.getLastName()+" "
						+game.getName()+" isimli oyun sipari�iniz "+camp.getCampName()+
						" kampanya paketi avantajlar�yla ger�ekle�mi�tir!");
		
	}
	
	

}
