package Shared;
import java.util.List;

public class AreaDetails {
	
	public int Id;
	public String Name;
	public List<RegionDetails> Regions;
	
	public AreaDetails(int id, String name, List<RegionDetails> regions)
	{
		Id = id;
		Name = name;
		Regions = regions;
	}
}
