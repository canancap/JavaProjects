package Inheritance;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.firstName+" Kullan�c�s� eklendi");
	}
	public void delete(User user) {
		System.out.println(user+" Kullan�c� silindi");
	}
	public void update(User user) {
		System.out.println(user+" Kullan�c� bilgileri g�ncellendi");
	}
	

}
