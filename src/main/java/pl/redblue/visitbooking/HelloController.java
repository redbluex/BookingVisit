package pl.redblue.visitbooking;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	
	
	@PostMapping("/singleday/{day}/{time}/formbook")
    public String greetingSubmit(@PathVariable String day,@PathVariable String time, @ModelAttribute Booking booking) {
		bookingServices.addNewBooking(booking);
        return "result";
    }
	
	@RequestMapping("/singleday/{day}")
	public String singleday(@PathVariable String day, Model model) {
		model.addAttribute("bookz", bookingServices.findByTime("6:00"));
		model.addAttribute("bookz2", bookingServices.findByTime("7:00"));
		model.addAttribute("bookz3", bookingServices.findByTime("8:00"));
		model.addAttribute("bookz4", bookingServices.findByTime("9:00"));
		model.addAttribute("bookz5", bookingServices.findByTime("10:00"));
        model.addAttribute("day", day);
		return "singleday";
	}
	
	@GetMapping("/singleday/{day}/{time}/formbook")
		public String formWithDay(@PathVariable String day,@PathVariable String time, Model model) {
		model.addAttribute("booking", new Booking());
		return "formbook";
		}
	

}
