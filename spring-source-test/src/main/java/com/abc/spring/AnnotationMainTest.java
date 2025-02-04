package com.abc.spring;

/**
 * @program: spring
 * @description:
 * @author: guo-coffee
 * @create: 2025-02-04
 */

import com.abc.spring.bean.Cat;
import com.abc.spring.bean.Person;
import com.abc.spring.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 注解版spring用法
 */
public class AnnotationMainTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
//		Person bean = context.getBean(Person.class);
//		System.out.println(bean.getName());
		String[] names = context.getBeanDefinitionNames();
//		for (String name : names) {
//			System.out.println(name);
//		}

//				Cat bean1 = context.getBean(Cat.class);
//
//		Cat bean2 = context.getBean(Cat.class);
//
//		System.out.println(bean1 == bean2);  //false
		Person bean1 = context.getBean(Person.class);
		Cat cat = bean1.getCat();
		Person bean2 = context.getBean(Person.class);
		Cat cat1 = bean2.getCat();
		System.out.println(cat1 == cat);  //true
//		System.out.println(cat1);
	}

}
