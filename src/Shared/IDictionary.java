package Shared;

import java.util.List;

public interface IDictionary<T> {
	public List<ValueDescription<T>> GetDescriptions();

	public String Description = "";
}
