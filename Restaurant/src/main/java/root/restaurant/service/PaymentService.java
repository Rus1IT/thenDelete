package root.restaurant.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import root.restaurant.repository.PaymentRepository;
import root.restaurant.table.Payment;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentService {
    private final PaymentRepository paymentRepository;

    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

}
