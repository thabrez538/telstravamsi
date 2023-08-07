package com.torryharris.springbootdemo;



import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;


import com.telstra.springbootdemo.model.Employee;

public class EmployeeTest {
	@Test
	public void getSalaryTest() {
		Employee e1=new Employee(1001,"Ram","Manager",200000);
		assertEquals(200000,e1.getSalary());
		
		Employee e2=new Employee(1002,"john","Software Engineer",100000);
		assertEquals("john",e2.getName());
	}
}
