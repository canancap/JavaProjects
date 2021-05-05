package Abstract;

import Entities.Gamer;

public interface IUserService {
	
	public void signUp(Gamer gamer);
	public void update();
	public void delete();
}
