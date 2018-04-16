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
	
	private List<Booking> booking = new ArrayList<>(Arrays.asList(
			new Booking("1", "10", "4", "20", "wizyta"),
			new Booking("2", "11", "4", "19", "spotkanie"),
			new Booking("3", "14", "4", "20", "kolacja")
			));
	public List<Booking> getAllBooking() {
		return booking;
	}
	
	public void addNewBooking(Booking book) {
		booking.add(book);
	}

	
}
