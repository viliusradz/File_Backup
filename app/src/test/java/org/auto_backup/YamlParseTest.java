package org.auto_backup;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

import org.auto_backup.yaml_parse.YamlParser;
import org.junit.jupiter.api.BeforeAll;

/**
 * YamlParseTest
 */
public class YamlParseTest {

	static final String TEST_PATH = "yamlTestFile.yaml";

	// TODO: Add copy task to move test resources to test dir
	// TODO: Add path expansion (inserting env vars)
	@Test
	void ReadFileResource() {
		var filePath = ClassLoader.getSystemClassLoader().getResource(TEST_PATH);
		var fileStream = ClassLoader.getSystemClassLoader().getResourceAsStream(TEST_PATH);
		assertNotNull(fileStream, "File NOT FOUND! \n" + filePath);

		var bufferedInStream = new BufferedInputStream(fileStream);
		var reader = new Scanner(bufferedInStream);

		String line;
		while (reader.hasNextLine()) {
			System.out.println(reader.nextLine());
		}

		reader.close();
	}

	@Test
	void ReadFileAbsolute() throws FileNotFoundException {
		var absolutePath = "/home/zagreus/.config/file-backup/schema.yaml";
		var systemFile = new File(absolutePath);

		assertTrue(systemFile.isFile(), "NO FILE " + systemFile.getAbsolutePath());

		var fileStream = new FileInputStream(systemFile);
		var bufferedStream = new BufferedInputStream(fileStream);
		Scanner scanner = new Scanner(bufferedStream);
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		scanner.close();
	}

	void WriteFile() {

	}

	@Test
	void Serialize() {

	}

	@Test
	void Deserialize() {

		// assertTrue(false, "s");
	}
}
