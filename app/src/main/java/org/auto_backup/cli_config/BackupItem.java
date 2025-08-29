package org.auto_backup.cli_config;

import java.util.function.Consumer;

/**
 * Backup
 */
public class BackupItem {
	private String source;
	private String destination;

	public BackupItem(String source, String destination) {
		this.source = source;
		this.destination = destination;
	}

	public static final Consumer<String> Backup = (path) -> System.out.println(path);

}
