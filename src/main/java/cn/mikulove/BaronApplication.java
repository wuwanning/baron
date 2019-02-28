package cn.mikulove;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan(basePackages = "cn.mikulove.dao")
@EnableCaching
@EnableRabbit
public class BaronApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaronApplication.class, args);
	}

}

