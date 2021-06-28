package hu.webuni.hr.csucsi.service;

import org.springframework.stereotype.Service;

import hu.webuni.hr.csucsi.model.Employee;

@Service
public class SalaryService{

	private EmployeeService employeeService;

	public SalaryService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	public int getEmployeeSalary(Employee employee) {
		return (int)(employee.getSalary() * (1.0 + ((double)(employeeService.getPayRaisePercent(employee))/100.0)));
	}
	
}
