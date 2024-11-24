package root.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import root.restaurant.table.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Long> {
}
