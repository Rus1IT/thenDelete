package root.restaurant.table;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Payment")
public class Payment {
    @Column(name = "payment_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;
    private Long guests_id;
    private String status;
    private int bill;
    private String method;
    private int discount;

}
