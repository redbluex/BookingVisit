package pl.redblue.visitbooking;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class HelloController {
	
	@Autowired
	private BookingServices bookingServices;
	
	@GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/bookings")
	public String list(Model model){
		model.addAttribute("book", bookingServices.getAllBooking());
		return "bookings";
	}
	
	@GetMapping("/formbook")
    public String greetingForm(Model model) {
        model.addAttribute("booking", new Booking());
        return "formbook";
    }
	
	
	
	@PostMapping("/formbook")
    public String greetingSubmit(@ModelAttribute Booking booking) {
		bookingServices.addNewBooking(booking);
        return "result";
    }

}
