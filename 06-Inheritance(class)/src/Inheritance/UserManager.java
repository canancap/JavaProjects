package Inheritance;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.firstName+" Kullanıcısı eklendi");
	}
	public void delete(User user) {
		System.out.println(user+" Kullanıcı silindi");
	}
	public void update(User user) {
		System.out.println(user+" Kullanıcı bilgileri güncellendi");
	}
	

}
