package jp.gr.java_conf.hangedman.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import jp.gr.java_conf.hangedman.model.Employee;

@Mapper
public interface EmployeesMapper {

	@Insert({"INSERT INTO employees "
			, " (emp_no, birth_date, first_name, last_name, gender, hire_date) "
			, " VALUES"
			, " (#{empNo}, #{birthDate}, #{firstName}, #{lastName}, #{gender}, #{hireDate)"})
	@Options(useGeneratedKeys = true)
	void insert(Employee employee);

	@Select("SELECT * FROM employees LIMIT 300")
	List<Employee> selectAll();
}
