package root.restaurant.table;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Departments")
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long department_id;
    @Column(name = "department_name")
    private String departmentName;
    private Long manager_id;
}
