package com.abc.spring.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @description:
 * @author: guo-coffee
 * @create: 2025-02-04
 */
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//容器就应该给Cat再创建一个对象
@Component
public class Cat {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
