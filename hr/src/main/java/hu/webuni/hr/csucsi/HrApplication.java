package hu.webuni.hr.csucsi;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

import hu.webuni.hr.csucsi.config.HrConfigProperties;
import hu.webuni.hr.csucsi.model.Employee;
import hu.webuni.hr.csucsi.service.SalaryService;

@SpringBootApplication
@Profile("admin")
public class HrApplication implements CommandLineRunner {

	@Autowired
	SalaryService salaryService;
	
	@Autowired
	HrConfigProperties config;
	
	public static void main(String[] args) {
		SpringApplication.run(HrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		int[] years = config.getRaise().getYear().getYearsArray();
		for(int i=0; i < years.length; i++) {
			Employee emp1 = new Employee(52,444,LocalDate.of(years[i],3,16).atStartOfDay());
			System.out.println("Havi fizetés növelés előtt: " + emp1.getSalary() + " USD");
			System.out.println("Havi fizetés növelés után: " + salaryService.getEmployeeSalary(emp1) + " USD\n\nNövekedés mértéke százalékban: " + salaryService.getEmployeeRaisePercent(emp1) + "%\n");
		}
	}

}

