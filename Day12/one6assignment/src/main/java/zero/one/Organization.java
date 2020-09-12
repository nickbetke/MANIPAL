package zero.one;

import java.util.LinkedList;
import java.util.List;

public class Organization {
	private int id;
	private String name;
	private List<Employee> employeeList;

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	@Override
	public String toString() {
		return "Organization [id=" + id + ", name=" + name + ", employeeList=" + employeeList + "]";
	}
	public void showDetails() {
		for(Employee e: employeeList) {
			System.out.println(e);
		}
	}
	
	
}
