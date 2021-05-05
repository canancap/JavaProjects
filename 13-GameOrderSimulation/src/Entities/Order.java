package Entities;


public class Order {
	int id;
	int gamerId;
	int gameId;
	String orderDate;
	
	public Order(int id, int gamerId, int gameId, String orderDate) {
		super();
		this.id = id;
		this.gamerId = gamerId;
		this.gameId = gameId;
		this.orderDate = orderDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGamerId() {
		return gamerId;
	}
	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	

}
