
import Adapters.MernisServiceAdapter;
import Concrete.GamerManager;
import Concrete.OrderManager;
import Entities.Camp;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1 = new Gamer(1,"Canan","�ap",1981,"29920468390");
		Game game1 = new Game(1,"Super Mario",100.5,"E�lenceli Oyun");
		Camp camp1 = new Camp(1,"Her�ey Yar�m Fiyat�na",1);
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.signUp(gamer1);
		
		OrderManager orderManager = new OrderManager();//campManager ili�kilendirdim ama orderda aktif kullanmad�m
		orderManager.order(gamer1,game1,camp1);// oyuncu bir oyun sat�n ald�,sipari� ger�ekle�ti.

	}

}
