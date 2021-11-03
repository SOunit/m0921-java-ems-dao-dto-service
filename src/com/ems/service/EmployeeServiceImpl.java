package com.ems.service;

import java.util.List;

import com.ems.dao.EmployeeDAO;
import com.ems.dao.EmployeeDAOMySQLImpl;
import com.ems.dto.Employee;
import com.ems.exception.EmployeeNotFoundException;

public class EmployeeServiceImpl implements EmployeeService{
	
	public EmployeeDAO empDAO = new EmployeeDAOMySQLImpl();

	@Override
	public List<Employee> showAllEmployees() {
		return empDAO.showAllEmployees();
	}

	@Override
	public void addEmployee(Employee e) {
		empDAO.addEmployee(e);
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee findEmployee(Employee e) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
