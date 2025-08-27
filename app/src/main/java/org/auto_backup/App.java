package org.auto_backup;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

/**
 * App
 */
public class App {
	public static void main(String[] args) {

		// Get command
		// Command types:
		// - backup [config_path] -> opt param
		// - import [config_path] -> opt param

		// Parse params
		System.out.println(args[1]);

		System.out.println("Backup complete");

		// Read config file
	}

}
// for reading resource files
// var fileStream =
// ClassLoader.getSystemClassLoader().getResourceAsStream("cache.txt");
// if (fileStream == null)
// throw new FileNotFoundException();
// else
// System.out.println(fileStream.toString());
// var streamReader = new InputStreamReader(fileStream);
// BufferedReader bufferedReader = new BufferedReader(streamReader);
// for (String line; (line = bufferedReader.readLine()) != null;) {
// System.out.println(line);
// }
// var url = ClassLoader.getSystemClassLoader().getResource("cache.txt");
// if (url == null)
// throw new FileNotFoundException("NO RESOURCE");
// var path = url.getPath();
// var file = new FileWriter(path);
// file.write("It works");
// file.close();
