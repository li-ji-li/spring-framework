package com.abc.spring;

import com.abc.spring.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring
 * @description:
 * @author: guo-coffee
 * @create: 2025-02-04
 */
public class MainTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person bean = context.getBean(Person.class);
		System.out.println(bean.toString() );
	}
}
