package org.auto_backup.yaml_parse;

import java.lang.reflect.ParameterizedType;

/**
 * GenericsTest
 */
public class GenericsTest<T> {
	public GenericsTest() {
		System.out.println(((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
	}

	Class<?> UnknownClass(Class<?> cl) {
		cl.getFields();
		return cl;
	}
}
