package jp.gr.java_conf.hangedman.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
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
    @Results({
          @Result(property = "empNo",     column = "emp_no")
        , @Result(property = "birthDate", column = "birth_date")
        , @Result(property = "firstName", column = "first_name")
        , @Result(property = "lastName",  column = "last_name")
        , @Result(property = "gender",    column = "gender")
        , @Result(property = "hireDate",  column = "hire_date")
    })
	List<Employee> selectAll();

	@Select("SELECT * FROM employees WHERE emp_no = #{empNo}")
    @Results({
          @Result(property = "empNo",     column = "emp_no")
        , @Result(property = "birthDate", column = "birth_date")
        , @Result(property = "firstName", column = "first_name")
        , @Result(property = "lastName",  column = "last_name")
        , @Result(property = "gender",    column = "gender")
        , @Result(property = "hireDate",  column = "hire_date")
    })
	Employee selectOne(Integer empNo);
}
