package root.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import root.restaurant.table.Payment;

import java.util.Optional;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
