package jp.gr.java_conf.hangedman.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jp.gr.java_conf.hangedman.mapper.EmployeesMapper;
import lombok.Data;

@Component
@Data
public class EmployeeService {

	@Autowired
	private EmployeesMapper employeesMapper;
}
