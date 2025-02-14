package com.abc.spring.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @description:
 * @author: guo-coffee
 * @create: 2025-02-04
 */
@ToString
@Data
@Component
public class Person {

	@Autowired
	ApplicationContext applicationContext;

	private String name;
	//@Autowired
	//依赖的组件是多实例就不能Autowired
	private Cat cat;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Lookup
	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}
}
