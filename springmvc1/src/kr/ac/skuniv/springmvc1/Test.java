package kr.ac.skuniv.springmvc1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.ac.skuniv.springmvc.config.ApplicationConfig;
import kr.ac.skuniv.springmvc.dao.TodoMapper;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		TodoMapper tododao = context.getBean(TodoMapper.class);
		System.out.println(tododao.getTodos().size());

	}

}
