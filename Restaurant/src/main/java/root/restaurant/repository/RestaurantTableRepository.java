package root.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import root.restaurant.table.RestaurantTable;

public interface RestaurantTableRepository extends JpaRepository<RestaurantTable, Long> {
}
