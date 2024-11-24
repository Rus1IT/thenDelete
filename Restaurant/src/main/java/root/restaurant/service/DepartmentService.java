package root.restaurant.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import root.restaurant.repository.DepartmentRepository;
import root.restaurant.repository.JobRepository;
import root.restaurant.table.Department;
import root.restaurant.table.Job;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    public List<Department> getAllDepartments(){
        return departmentRepository.findAll();
    }

    public Optional<Department> getDepartmentByName(String name){
        return departmentRepository.findByDepartmentName(name);
    }
}
