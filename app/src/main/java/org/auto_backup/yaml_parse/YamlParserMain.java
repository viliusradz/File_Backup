package org.auto_backup.yaml_parse;

import org.auto_backup.cli_config.ConfigObject;
import org.auto_backup.interfaces.Serialization;

/**
 * YamlParserMain
 */
public class YamlParserMain {

	public static void main(String[] args) {

		GenericsTest test = new GenericsTest<ConfigObject>() {
		};
		// GenericYamlParser parser = new GenericYamlParser() {
		// };
		System.out.println("HELLO WORLD");
	}

}
