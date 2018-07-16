package cn.mesie.slf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"cn.mesie.controller","cn.mesie.service"})
@MapperScan("cn.mesie.mapper")
public class SlfApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlfApplication.class, args);
	}
}
