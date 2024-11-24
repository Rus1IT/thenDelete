package root.restaurant.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import root.restaurant.repository.EmployeesRepository;
import root.restaurant.table.Employees;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeesService {
    private final EmployeesRepository employeesRepository;

    public List<Employees> getAllEmployees(){
        return employeesRepository.findAll();
    }

    public void save(Employees employees){
        employeesRepository.save(employees);
    }


}
