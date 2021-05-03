package Inheritance;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.firstName+" Kullanýcýsý eklendi");
	}
	public void delete(User user) {
		System.out.println(user+" Kullanýcý silindi");
	}
	public void update(User user) {
		System.out.println(user+" Kullanýcý bilgileri güncellendi");
	}
	

}
