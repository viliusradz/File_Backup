package org.auto_backup.yaml_parse;

import java.util.ArrayList;

import org.auto_backup.cli_config.BackupItem;
import org.auto_backup.cli_config.ConfigObject;
import org.auto_backup.git_logic.RepoConfig.RepoType;
import org.auto_backup.interfaces.Serialization;

/**
 * YamlParser
 */
public class YamlParser<T> implements Serialization<T> {

	@Override
	public String[] serialize(T data) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'serialize'");
	}

	@Override
	public T deserialize(String[] data) {
		var repoPath = "~/repo_test/";
		var repoUrl = "https://funny.com/repo";
		ArrayList<BackupItem> backupItems = new ArrayList<>();
		backupItems.add(new BackupItem("~/.config/nvim/init.lua", ".config/nvim/init.lua"));
		backupItems.add(new BackupItem("this", "that"));
		return (T) new ConfigObject(repoPath, repoUrl, backupItems);
	}
}
