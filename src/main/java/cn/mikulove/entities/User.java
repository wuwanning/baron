package cn.mikulove.entities;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String name;
	
	private Integer age;
	
	private Date birthday;

}
