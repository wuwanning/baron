package cn.mikulove;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "cn.mikulove.dao")
public class BaronApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaronApplication.class, args);
	}

}

