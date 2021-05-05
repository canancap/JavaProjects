package Concrete;

import Abstract.IOrderService;
import Entities.Camp;
import Entities.Game;
import Entities.Gamer;

public class OrderManager implements IOrderService{
	
	

	@Override
	public void order(Gamer gamer, Game game, Camp camp) {
		
		System.out.println("Sayýn "+gamer.getFirstName()+" "+ gamer.getLastName()+" "
						+game.getName()+" isimli oyun sipariþiniz "+camp.getCampName()+
						" kampanya paketi avantajlarýyla gerçekleþmiþtir!");
		
	}
	
	

}
