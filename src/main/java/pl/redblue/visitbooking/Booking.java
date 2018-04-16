package pl.redblue.visitbooking;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Booking {
	
	@Id
	private String id;
	private String day;
	private String month;
	private String time;
	private String name;
	
	
	public Booking() {
		
	}
	
	public Booking(String id, String day, String month, String time, String name) {
		this.id = id;
		this.day = day;
		this.month = month;
		this.time = time;
		this.name = name;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
