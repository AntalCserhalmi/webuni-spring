package hu.webuni.hr.csucsi.model;

import java.time.LocalDateTime;

public class Employee{
	private long id;
	private int salary;
	private LocalDateTime startOfWork;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public LocalDateTime getStartOfWork() {
		return startOfWork;
	}
	public void setStartOfWork(LocalDateTime startOfWork) {
		this.startOfWork = startOfWork;
	}
	
	public Employee(long id, int salary, LocalDateTime startOfWork) {
		this.id = id;
		this.salary = salary;
		this.startOfWork = startOfWork;
	}
	

}
