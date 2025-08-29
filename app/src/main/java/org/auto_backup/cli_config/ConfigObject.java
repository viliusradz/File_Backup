package org.auto_backup.cli_config;

import java.util.ArrayList;

import org.auto_backup.git_logic.RepoConfig;

/**
 * ConfigObject
 */
public class ConfigObject extends RepoConfig {
	private ArrayList<BackupItem> backupItems;

	public ConfigObject(String repoPath, String repoUrl) {
		super(repoPath, repoUrl);
		backupItems = new ArrayList<>();
	}

	public ConfigObject(String repoPath, String repoUrl, ArrayList<BackupItem> backupItems) {
		this(repoPath, repoUrl);
		this.backupItems = backupItems;
	}

	public ArrayList<BackupItem> getBackupItems() {
		return backupItems;
	}

	public void setBackupItems(ArrayList<BackupItem> backupItems) {
		this.backupItems = backupItems;
	}

	public void performBackup() {
		for (BackupItem item : backupItems) {
			item.Backup();
		}
		System.out.println("Files successfully copied to backup directory");
	}

	public void populateLocal() {
		for (BackupItem item : backupItems) {
			item.Populate();
		}
		System.out.println("Files successfully copied to target directories");
	}
}
