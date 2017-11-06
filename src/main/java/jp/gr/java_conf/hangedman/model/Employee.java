package jp.gr.java_conf.hangedman.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class Employee implements Serializable {
    private Integer empNo;
    private Date birthDate;
    private String firstName;
    private String lastName;
    private String gender;
    private Date hireDate;
}
