package root.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import root.restaurant.table.Job;

import java.util.Optional;

public interface JobRepository extends JpaRepository<Job, Long> {
    Optional<Job> findByJobName(String jobName);
}
