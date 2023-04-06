package com.ex2.lab08_ex2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeManage 
{
	@Autowired
	private EmployeeRepository repo;

	public List<Employee> listAll() {
		return repo.findAll();
	}

	public void save(Employee em) {
		repo.save(em);
	}

	public Employee get(long id) {
		return repo.findById(id).get();
	}

	public void delete(long id) {
		repo.deleteById(id);
	}
}
