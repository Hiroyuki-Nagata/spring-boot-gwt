package jp.gr.java_conf.hangedman.service;

import org.springframework.stereotype.Component;

import jp.gr.java_conf.hangedman.mapper.EmployeesMapper;
import lombok.Data;

@Component
@Data
public class EmployeeService {
	private EmployeesMapper employeesMapper;
}
