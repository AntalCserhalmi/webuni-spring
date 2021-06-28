package hu.webuni.hr.csucsi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import hu.webuni.hr.csucsi.service.DefaultEmployeeService;
import hu.webuni.hr.csucsi.service.EmployeeService;

@Configuration
@Profile("!admin")
public class DefaultSalaryRaiseConfiguration {

	@Bean
	public EmployeeService employeeService(){
		return new DefaultEmployeeService();
	}

}
