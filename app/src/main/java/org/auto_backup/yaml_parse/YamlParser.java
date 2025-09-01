package org.auto_backup.yaml_parse;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;

import org.auto_backup.cli_config.BackupItem;
import org.auto_backup.cli_config.ConfigObject;
import org.auto_backup.git_logic.RepoConfig.RepoType;
import org.auto_backup.interfaces.Serialization;

/**
 * YamlParser
 */
public class YamlParser<T> extends GenericYamlParser<T> {
	// final Class<T> typeParameter;

	public YamlParser() {
		System.out.println(
				"HI " + ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
	}

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

	private ArrayList<String> getVariables() {
		return null;
	}
}
