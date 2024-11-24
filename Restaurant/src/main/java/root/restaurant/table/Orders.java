package root.restaurant.table;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "Orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long order_id;
    private Long table_id;
    private Long price;
    private String status;
    private Long guests_id;
    private Date created_at;
}
