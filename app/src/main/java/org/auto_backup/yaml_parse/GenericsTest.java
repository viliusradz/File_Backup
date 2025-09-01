package org.auto_backup.yaml_parse;

import java.lang.reflect.ParameterizedType;

/**
 * GenericsTest
 */
public abstract class GenericsTest<T> {

	public GenericsTest() {
		// System.out.println(((ParameterizedType)
		// this.getClass().getGenericInterfaces()[0]).getTypeName());
		// System.out.println(this.getClass().getGenericInterfaces()[0].getClass().getGenericSuperclass().getTypeName());
		// System.out.println((this.getClass().getGenericInterfaces()[0].getClass().getGenericSuperclass()));
		System.out.println(((ParameterizedType) this.getClass().getGenericSuperclass()).getTypeName());
		// System.out.println((this.getClass().getGenericSuperclass().getTypeName().));
	}

	Class<?> UnknownClass(Class<?> cl) {
		cl.getFields();
		return cl;
	}
}
