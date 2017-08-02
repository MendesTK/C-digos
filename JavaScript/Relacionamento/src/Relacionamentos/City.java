package Relacionamentos;

import java.util.List;

public class City {

	private String name;
	private String country;
	private List<Airport> airport;
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
	public List<Airport> getAirport() {
		return airport;
	}
	public void setAirport(List<Airport> airport) {
		this.airport = airport;
	}
	
	
}
