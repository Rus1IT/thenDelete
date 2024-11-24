package root.restaurant.table;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Place")
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long place_id;
    @Column(name = "name_of_hall")
    private String name;
    private Long price;
    private String decor;
    private String atmosphere;
    private String uniq_feature;
}

