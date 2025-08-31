package org.auto_backup.interfaces;

/**
 * Serialization
 */
public interface Serialization<T> {
	public String[] serialize(T data);

	public T deserialize(String[] data);
}
