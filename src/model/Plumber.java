package model;

public class Plumber {
	private long id;
	private String name;
	private String city;
	private long mobile_numer;
	
	
	
	
	public Plumber(long id, String name, String city, long mobile_numer) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.mobile_numer = mobile_numer;
	}
	public Plumber() {
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMobile_numer() {
		return mobile_numer;
	}
	public void setMobile_numer(long mobile_numer) {
		this.mobile_numer = mobile_numer;
	}
	
	
}
