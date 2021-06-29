package hu.webuni.hr.csucsi.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import java.time.temporal.ChronoUnit;

import hu.webuni.hr.csucsi.config.HrConfigProperties;
import hu.webuni.hr.csucsi.model.Employee;

@Service
@Profile("admin")
public class SmartEmployeeService implements EmployeeService {
	
	@Autowired
	HrConfigProperties config;
	@Override
	public int getPayRaisePercent(Employee employee) {
		final int[] percent = config.getRaise().getSmart().getRaiseLimits();
		final double[] limit = config.getRaise().getSmart().getLimits();
		
		double workOfYears = (ChronoUnit.DAYS.between(employee.getStartOfWork(),LocalDateTime.now())) / 365d;
		
		int raisePercent; 
		if(workOfYears >= limit[0])
			raisePercent = percent[0];
		else if( workOfYears >= limit[1] && workOfYears < limit[0])
			raisePercent = percent[1];
		else if(workOfYears >= limit[2] && workOfYears < limit[1])
			raisePercent = percent[2];
		else
			raisePercent = 0;
		
		return raisePercent;
	
	}
}
