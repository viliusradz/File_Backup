package org.auto_backup.git_logic;

/**
 * GitConfig
 */
public class GitConfig {
	public enum RepoType {
		Private, Public,
	}

	private String repo_path;
	private String repo_url;
	private RepoType repo_type;
}
