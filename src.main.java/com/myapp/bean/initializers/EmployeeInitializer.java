package com.myapp.bean.initializers;

import java.util.ArrayList;
import java.util.List;

import com.myapp.dao.Employee;
import com.myapp.vo.Address;

public class EmployeeInitializer {

	Address addr1 = new Address("city1", "state1", "country1", "zip1");
	Address addr2 = new Address("city2", "state2", "country2", "zip2");
	Address addr3 = new Address("city3", "state3", "country3", "zip3");
	Address addr4 = new Address("city4", "state4", "country4", "zip4");
	Address addr5 = new Address("city5", "state5", "country5", "zip5");

	Employee emp1 = new Employee("FirstName1", "lastName1", addr1, addr2, "m", "qwqqadfgwwq@email.com", "1234558989");
	Employee emp2 = new Employee("FirstName2", "lastName2", addr1, addr2, "f", "wqtyhbvdfd@email.com", "34343243768");
	Employee emp3 = new Employee("FirstName3", "lastName3", addr1, addr2, "f", "iiyyuyuuyu@email.com", "12347576755");
	Employee emp4 = new Employee("FirstName4", "lastName4", addr1, addr2, "m", "ryyryyrry@email.com", "768795675898");
	Employee emp5 = new Employee("FirstName5", "lastName5", addr1, addr2, "o", "qqasasasasaq@email.com", "909966656");

	List<Employee> aList = new ArrayList<>();

	public List<Employee> getEmployees() {
		aList.add(emp1);
		aList.add(emp2);
		aList.add(emp3);
		aList.add(emp4);
		aList.add(emp5);
		return aList;
	}

}
