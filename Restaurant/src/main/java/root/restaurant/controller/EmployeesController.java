package root.restaurant.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import root.restaurant.service.DepartmentService;
import root.restaurant.service.EmployeesService;
import root.restaurant.service.JobService;
import root.restaurant.service.OrderService;
import root.restaurant.table.Department;
import root.restaurant.table.Employees;
import root.restaurant.table.Job;
import root.restaurant.table.Orders;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class EmployeesController {

    private final EmployeesService employeesService;
    private final JobService jobService;
    private final DepartmentService departmentService;
    private final OrderService orderService;

    @GetMapping("/")
    public String mainPage(Model model) {
        return "index";
    }

    @GetMapping("/payment")
    public String paymentPage(@RequestParam("order_id") Long orderId, Model model) {
        // Логика обработки orderId, если нужно
        model.addAttribute("orderId", orderId); // Передаем в модель, если требуется отобразить на странице
        return "payment";
    }


    @GetMapping("/employees")
    public String showAllEmployees(Model model) {
        var employees = employeesService.getAllEmployees();
        System.out.println("Model:"+model);
        model.addAttribute("employees", employees);
        System.out.println("Model 2:"+model);
        return "employees_list";
    }

    @GetMapping("/createEmployee")
    public String createEmployees(Model model) {
        List<Job> jobs = jobService.getAllJobs();
        List<Department> departments = departmentService.getAllDepartments();
        model.addAttribute("jobs",jobs );
        model.addAttribute("departments",departments );
        return "createEmployee";
    }

    @PostMapping("/createEmployee")
    public String addNewEmployee(@ModelAttribute Employees employee,
                                 @RequestParam String jobName, @RequestParam String departmentName,
                                 Model model) {
        Optional<Job> opt_job = jobService.getJobByName(jobName);
        Optional<Department> opt_department = departmentService.getDepartmentByName(departmentName);
        employee.setJobId(opt_job.get().getJob_id());
        employee.setDepartmentId(opt_department.get().getDepartment_id());

        employeesService.save(employee);

        return "redirect:/employees";
    }

    @GetMapping("/orders")
    public String getOrders(Model model) {
        List<Orders> orders = orderService.getAllOrders();
        model.addAttribute("orders", orders);
        return "orders";
    }


}
