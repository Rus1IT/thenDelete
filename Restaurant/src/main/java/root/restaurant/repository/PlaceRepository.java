package root.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import root.restaurant.table.Place;

public interface PlaceRepository extends JpaRepository<Place, Long> {
}
