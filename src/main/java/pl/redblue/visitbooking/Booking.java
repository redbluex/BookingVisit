package pl.redblue.visitbooking;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String day;
	private String month;
	private String time;
	private String name;
	private boolean free;
	
	
	public Booking() {
		
	}
	
	public Booking(String day, String month, String time, String name) {
		this();
		this.day = day;
		this.month = month;
		this.time = time;
		this.name = name;
		this.free = true;
		
	}
	
	public Booking(int id, String day, String month, String time, String name) {
		this.id = id;
		this.day = day;
		this.month = month;
		this.time = time;
		this.name = name;
		this.free = true;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}
	
	
	
	

}
