package OOPIntro;


public class Category {
	

	private int id;
	private String name;
	
	public Category() {
		System.out.println("ben �al��t�m");
	}
	
	public Category(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {//bir�ey d�nd�rmeyecem sadece bir�ye yapacam
		this.id=id;
	}
	public String getName() {
		return this.name+"!";
	}
	public void setName(String name) {
		this.name=name;
	}
}
