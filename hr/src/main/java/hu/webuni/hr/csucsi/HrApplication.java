package hu.webuni.hr.csucsi;
import java.time.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hu.webuni.hr.csucsi.model.Employee;
import hu.webuni.hr.csucsi.service.SalaryService;

@SpringBootApplication
public class HrApplication implements CommandLineRunner {

	@Autowired
	SalaryService salaryService;
	
	public static void main(String[] args) {
		SpringApplication.run(HrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		final Employee emp1 = new Employee(2,444,LocalDate.of(2020, 3, 18).atStartOfDay());
		final Employee emp2 = new Employee(2,444,LocalDate.of(2015, 3, 18).atStartOfDay());
		final Employee emp3 = new Employee(2,444,LocalDate.of(1999, 3, 18).atStartOfDay());
		
		System.out.println("\nHavi fizetés növelés előtt: " + emp1.getSalary() + " USD");
		System.out.println("Havi fizetés növelés után: " + salaryService.getEmployeeSalary(emp1) + " USD\n");
		
		System.out.println("Havi fizetés növelés előtt: " + emp2.getSalary() + " USD");
		System.out.println("Havi fizetés növelés után: " + salaryService.getEmployeeSalary(emp2) + " USD\n");
		
		System.out.println("Havi fizetés növelés előtt: " + emp3.getSalary() + " USD");
		System.out.println("Havi fizetés növelés után: " + salaryService.getEmployeeSalary(emp3) + " USD\n");
	}

}
