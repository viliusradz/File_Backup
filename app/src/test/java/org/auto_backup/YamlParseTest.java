package org.auto_backup;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import org.auto_backup.cli_config.BackupItem;
import org.auto_backup.cli_config.ConfigObject;
import org.auto_backup.git_logic.RepoConfig.RepoType;
import org.auto_backup.interfaces.Serialization;
import org.auto_backup.yaml_parse.YamlParser;
import org.junit.jupiter.api.BeforeAll;

/**
 * YamlParseTest
 */
public class YamlParseTest {

	static final String TEST_PATH = "yamlTestFile.yaml";

	static Serialization<ConfigObject> yamlParser;
	static ConfigObject expectedYamlObject;

	@BeforeAll
	static final void initVariables() {
		yamlParser = new YamlParser<>();

		var repoPath = "~/repo_test/";
		var repoUrl = "https://funny.com/repo";
		ArrayList<BackupItem> backupItems = new ArrayList<>();
		backupItems.add(new BackupItem("~/.config/nvim/init.lua", ".config/nvim/init.lua"));
		backupItems.add(new BackupItem("this", "that"));
		expectedYamlObject = new ConfigObject(repoPath, repoUrl, backupItems);
		expectedYamlObject.setType(RepoType.Private);
	}

	// TODO: Add copy task to move test resources to test dir
	// TODO: Add path expansion (inserting env vars)
	@Test
	void ReadFileResource() {
		var filePath = ClassLoader.getSystemClassLoader().getResource(TEST_PATH);
		var fileStream = ClassLoader.getSystemClassLoader().getResourceAsStream(TEST_PATH);
		assertNotNull(fileStream, "File NOT FOUND! \n" + filePath);

		var bufferedInStream = new BufferedInputStream(fileStream);
		var reader = new Scanner(bufferedInStream);

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

	@Test
	void Serialize() {
	}

	@Test
	void Deserialize() {
		var yamlFile = ClassLoader.getSystemClassLoader().getResourceAsStream(TEST_PATH);
		var yamlContent = new BufferedInputStream(yamlFile);
		var scanner = new Scanner(yamlContent);

		ArrayList<String> lines = new ArrayList<>();
		while (scanner.hasNextLine()) {
			lines.add(scanner.nextLine());
		}
		scanner.close();

		String[] lineArray = new String[lines.size()];
		lineArray = lines.toArray(lineArray);
		var yamlObject = yamlParser.deserialize(lineArray);

		assertEquals(expectedYamlObject.getClass(), yamlObject.getClass());
		System.out.println(expectedYamlObject.toString());
		System.out.println(yamlObject.toString());
		// assertTrue(false, "s");
	}
}
