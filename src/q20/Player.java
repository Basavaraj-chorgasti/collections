package q20;

public class Player {
	
	private int id;
	private String name;
	private String country;
	private String team;
	public Player(int id, String name, String country, String team)
	{
		
		this.id = id;
		this.name = name;
		this.country = country;
		this.team = team;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return "Player [id=" + id + ", name=" + name + ", country=" + country + ", team=" + team + "]";
	}
	

}
