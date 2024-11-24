package root.restaurant.table;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Restaurant_table")
public class RestaurantTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long table_id;
    private String status;
    private int place_id;
}

