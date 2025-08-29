package org.auto_backup;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.auto_backup.yaml_parse.YamlParser;
import org.junit.jupiter.api.BeforeAll;

/**
 * YamlParseTest
 */
public class YamlParseTest {

	static final String TEST_PATH = "./test_files/yamlTestFile.yaml";

	// TODO: Add copy task to move test resources to test dir
	@Test
	void ReadFile() throws FileNotFoundException {
		var sourceFile = new File(TEST_PATH);
		assertNotNull(sourceFile, "File NOT FOUND!");
		Scanner scanner = new Scanner(sourceFile);
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		scanner.close();

	}

	@Test
	void WriteFile() {

	}

	@Test
	void Serialize() {

	}

	@Test
	void Deserialize() {

		assertTrue(false, "s");
	}
}
