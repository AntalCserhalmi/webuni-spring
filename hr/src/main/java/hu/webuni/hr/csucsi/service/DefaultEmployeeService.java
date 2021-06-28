package hu.webuni.hr.csucsi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import hu.webuni.hr.csucsi.config.HrConfigProperties;
import hu.webuni.hr.csucsi.model.Employee;

@Service
@Profile("!admin")
public class DefaultEmployeeService implements EmployeeService {

	@Autowired
	HrConfigProperties config;
	
	@Override
	public int getPayRaisePercent(Employee employee) {
		return config.getRaise().getDef().getPercent();
	}
}
