package org.auto_backup.yaml_parse;

import java.lang.reflect.ParameterizedType;

import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

/**
 * GenericsTest
 */
public abstract class GenericsTest<T extends Object> {

	public GenericsTest() {
		// System.out.println(((ParameterizedType)
		// this.getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
		// System.out.println(((ParameterizedType)
		// this.getClass().getGenericInterfaces()[0]).getActualTypeArguments()[0]);
		var curClass = this.getClass();
		var supClass = curClass.getGenericSuperclass();
		var actArgs = ((ParameterizedType) supClass).getActualTypeArguments()[0];
		var argClass = actArgs.getClass();
		var argName = actArgs.getClass().getName();
		var fields = argClass.getMethods();
		var name = actArgs.getTypeName();
		System.out.println(actArgs);

		System.out.println(argName);
		var thisLoader = this.getClass().getName();
		// for (var f : fields)
		// System.out.println(f);
	}

	Class<?> UnknownClass(Class<?> cl) {
		cl.getFields();
		return cl;
	}
}
