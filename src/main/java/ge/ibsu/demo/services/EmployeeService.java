package ge.ibsu.demo.services;

import ge.ibsu.demo.entities.Employee;
import ge.ibsu.demo.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService
{
    @Autowired
    public EmployeeRepository employeeRepository;

    public List<Employee> getAll()
    {
        return employeeRepository.findAll();
    }

    public Employee getById(Long id) throws Exception
    {
        return employeeRepository.findById(id).orElseThrow(() -> new Exception("RECORD_NOT_FOUND"));
    }
}
