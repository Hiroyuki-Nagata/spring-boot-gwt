package jp.gr.java_conf.hangedman.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jp.gr.java_conf.hangedman.model.Employee;
import jp.gr.java_conf.hangedman.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	protected EmployeeService employeesService;

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public List<Employee> list() {
		return employeesService.getEmployeesMapper().selectAll();
	}
}
