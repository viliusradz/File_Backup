package org.auto_backup.git_logic;

/**
 * GitConfig
 */
public class RepoConfig {
	public enum RepoType {
		Private, Public,
	}

	private String path;
	private String url;
	private RepoType type;

	public RepoConfig(String path, String url) {
		this.path = path;
		this.url = url;
		this.type = RepoType.Private;
	}

	public RepoConfig(String path, String url, RepoType type) {
		this(path, url);
		this.type = type;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public RepoType getType() {
		return type;
	}

	public void setType(RepoType type) {
		this.type = type;
	}

}
