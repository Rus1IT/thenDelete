package root.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import root.restaurant.table.Employees;

import java.util.Optional;

public interface EmployeesRepository extends JpaRepository<Employees, Long> {
    Optional<Employees> findByEmployeeName(String employeeName);
}
