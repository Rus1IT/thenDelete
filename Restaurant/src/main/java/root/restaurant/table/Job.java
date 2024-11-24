package root.restaurant.table;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Data
@Table(name = "Jobs")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long job_id;
    @Column(name = "job_name")
    private String jobName;
    private Long department_id;
    private int min_salary;
    private  int max_salary;
    private  String job_description;
    private Date created_at;
}
