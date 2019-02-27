package cn.mikulove.entities;

import java.util.Date;

import lombok.Data;

@Data
public class User {
	
	private Integer id;
	
	private String name;
	
	private Integer age;
	
	private Date birthday;

}
