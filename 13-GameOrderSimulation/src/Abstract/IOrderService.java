package Abstract;

import Entities.Camp;
import Entities.Game;
import Entities.Gamer;

public interface IOrderService {
	
	public void order(Gamer gamer,Game game,Camp camp);
	

}
