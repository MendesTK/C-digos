package Relacionamentos;

import java.util.Date;
import java.util.List;

public class Flight {
	
	private int number;
	private String status;
	private Date date;
	private Airplane airplane;
	private List<Passenger> passenger;
	private Airport fromAirport;
	private Airport toAirport;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Airplane getAirplane() {
		return airplane;
	}
	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}
	public List<Passenger> getPassenger() {
		return passenger;
	}
	public void setPassenger(List<Passenger> passenger) {
		this.passenger = passenger;
	}
	public Airport getFromAirport() {
		return fromAirport;
	}
	public void setFromAirport(Airport fromAirport) {
		this.fromAirport = fromAirport;
	}
	public Airport getToAirport() {
		return toAirport;
	}
	public void setToAirport(Airport toAirport) {
		this.toAirport = toAirport;
	}
	
	
}
