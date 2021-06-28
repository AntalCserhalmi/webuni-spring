package hu.webuni.hr.csucsi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import hu.webuni.hr.csucsi.service.EmployeeService;
import hu.webuni.hr.csucsi.service.SmartEmployeeService;

@Configuration
@Profile("admin")
public class SmartSalaryRaiseConfiguration {

	@Bean
	public EmployeeService employeeService() {
		return new SmartEmployeeService();
	}
}
