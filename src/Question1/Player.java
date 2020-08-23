package Question1;

public class Player {
	
	int playerid;
	String pname;
	String country;
	String team;
	public Player(int playerid, String pname, String country, String team) {
		super();
		this.playerid = playerid;
		this.pname = pname;
		this.country = country;
		this.team = team;
	}
	public int getPlayerid() {
		return playerid;
	}
	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	@Override
	public String toString() {
		return "Player [playerid=" + playerid + ", pname=" + pname + ", country=" + country + ", team=" + team + "]";
	}
	
	

}
