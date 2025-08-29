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

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public static Consumer<String> getBackup() {
		return Backup;
	}

	public boolean Backup() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'Backup'");
	}

	public boolean Populate() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'Populate'");
	}

}
