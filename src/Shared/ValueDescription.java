package Shared;

public class ValueDescription<T> {
	public T Key;
	public String Description;

	public ValueDescription(T key, String description) {
		Key = key;
		Description = description;
	}
	
	public String toString() {
        return this.Description;
    } 
}
