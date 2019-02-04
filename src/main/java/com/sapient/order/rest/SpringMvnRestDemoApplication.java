package com.sapient.order.rest;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication
public class SpringMvnRestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvnRestDemoApplication.class, args);
	}

	private DataSource dataSource() {
		return new DriverManagerDataSource("jdbc:mysql://localhost:3306/order_management", "root", "root");
	}

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
		localSessionFactoryBean.setDataSource(dataSource());
		localSessionFactoryBean.setPackagesToScan(new String[]{"com.sapient.order.rest"});
		return localSessionFactoryBean;
	}
}
