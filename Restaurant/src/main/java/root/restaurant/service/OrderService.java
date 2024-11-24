package root.restaurant.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import root.restaurant.repository.JobRepository;
import root.restaurant.repository.OrdersRepository;
import root.restaurant.table.Job;
import root.restaurant.table.Orders;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrdersRepository ordersRepository;

    public List<Orders> getAllOrders(){
        return ordersRepository.findAll();
    }
}
