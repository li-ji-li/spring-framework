package com.abc.spring.config;

import com.abc.spring.bean.Cat;
import com.abc.spring.bean.Person;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @program: spring
 * @description:
 * @author: guo-coffee
 * @create: 2025-02-04
 */
//@Import({ MainConfig.MyImportRegistrar.class})
@ComponentScan("com.abc.spring")
@Configuration
public class MainConfig   {
   //@Bean
	public Person person(){
		Person person = new Person();
		person.setName("李四");
		return person;
	}
	/**
	 * 		BeanDefinitionRegistry：Bean定义信息注册中心：图纸中心;
	 * 				它里面都是BeanDefinition
	 *
	 * 	<bean class="com.atguigu.spring.bean.Person" id="person">
	 * 		<property name="name" value="张三"/>
	 * 	</bean>
	 * 	 对应
	 * 	RootBeanDefinition
	 *
	 */
	static class MyImportRegistrar implements ImportBeanDefinitionRegistrar {
		@Override
		public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
											BeanDefinitionRegistry registry) {


			// BeanDefinition
			RootBeanDefinition catDefinition = new RootBeanDefinition();
			catDefinition.setBeanClass(Cat.class);
			//可以声明定义信息，包括我需要自动装配什么？

			//Spring 这个实例的类型，名字
			registry.registerBeanDefinition("tomCat",catDefinition);
		}
	}
}
