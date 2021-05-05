package Entities;

public class Camp {
	
	int id;
	String campName;
	int gameId;
	
	public Camp(int id, String campName, int gameId) {
		super();
		this.id = id;
		this.campName = campName;
		this.gameId = gameId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampName() {
		return campName;
	}

	public void setCampName(String campName) {
		this.campName = campName;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

}
