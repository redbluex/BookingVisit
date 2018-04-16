package pl.redblue.visitbooking;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {
	
	@Autowired
	private BookingServices bookingServices;
	
	@RequestMapping("/bookingss")
	public List<Booking> getBookings(Model model){
		return bookingServices.getAllBooking();
	}
	
	
	

}
