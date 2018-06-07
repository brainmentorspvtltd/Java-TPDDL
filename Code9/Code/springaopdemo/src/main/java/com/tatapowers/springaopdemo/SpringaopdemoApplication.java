package com.tatapowers.springaopdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringaopdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringaopdemoApplication.class, args);
		MyBean bean = context.getBean(MyBean.class);
		SecondBean bean2 = context.getBean(SecondBean.class);
		bean.print();
		bean2.printing();
		
	}
}
