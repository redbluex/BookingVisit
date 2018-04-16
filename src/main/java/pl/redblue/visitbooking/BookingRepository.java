package pl.redblue.visitbooking;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
	
	public List<Booking> findAllByName(String name);
}
