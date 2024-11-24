package root.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import root.restaurant.table.Department;

import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Optional<Department> findByDepartmentName(String departmentName);
}
