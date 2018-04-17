package pl.redblue.visitbooking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServices {
	
	@Autowired
	BookingRepository bookingRepository;
	
	private List<Booking> booking;
	
	public List<Booking> getAllBooking() {
		List<Booking> bookings = new ArrayList<>();
		bookingRepository.findAll().forEach(bookings::add);
		return bookings;
	}
	
	public void addNewBooking(Booking book) {
		bookingRepository.save(book);
	}
	
	public List<Booking> getAllBookingByName(String day){
		List<Booking> bookingz = new ArrayList<>();
		bookingRepository.findAllByDay(day).forEach(bookingz::add);
		return bookingz;
		
	}
	
	public Booking findByTime(String time) {
		Booking b = new Booking();
		b = bookingRepository.findByTime(time);
		return b;
	}



	
}
