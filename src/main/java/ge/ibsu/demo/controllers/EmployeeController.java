package ge.ibsu.demo.controllers;

import ge.ibsu.demo.entities.Department;
import ge.ibsu.demo.entities.Employee;
import ge.ibsu.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/employees")
public class EmployeeController
{
    @Autowired
    public EmployeeService employeeService;

    @RequestMapping(value = "all", method = RequestMethod.GET, produces = { "application/json" })
    public List<Employee> getALL()
    {
        return employeeService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = { "application/json" })
    public Employee getById(@PathVariable Long id) throws Exception
    {
        return employeeService.getById(id);
    }
}
