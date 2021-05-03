package OOPIntro;


public class Product {
	
	
	public Product() {
		System.out.println("ben çalýþtým");
	}
	
	public Product(int id, String name, double unitPrice, String detail,double discount) {
		super();
		this.id = id;//bu class içindeki id yi constructor içindeki id ye eþitliyorum.
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}

	//encapsulation
	private int id;// final sadece constructor de set edilebilir demek
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;
	
	
	
	public int getId() {//bu deðeri okuyorum.
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name + "!";
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {//bu deðeri okuyorum. ben set etmeyecem elimle
		return this.unitPrice-(this.unitPrice*this.discount/100);
	}

	
	
}
