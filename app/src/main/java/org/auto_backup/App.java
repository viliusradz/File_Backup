package org.auto_backup;

import java.util.Scanner;

/**
 * App
 */
public class App {
	public static void main(String[] args) {
		BackupItem item = new BackupItem("HI", "there");

		Scanner scan = new Scanner(System.in);
		// item.Backup.accept("hi");
		BackupItem.Backup.accept("hi");
	}
}
