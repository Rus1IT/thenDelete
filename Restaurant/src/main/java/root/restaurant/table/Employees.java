package root.restaurant.table;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@Table(name = "Employees")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    @Column(name = "employee_name")
    private String employeeName;
    @Column(name = "employee_surname")
    private String employeeSurname;
    private int salary;
    private LocalDate hireDate;
    private Long jobId;
    @Column(name = "department_id")
    private Long departmentId;
    private Date created_at;


}
