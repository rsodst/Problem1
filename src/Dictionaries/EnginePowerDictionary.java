package Dictionaries;
import java.util.ArrayList;
import java.util.List;

import Enums.EnginePowerEnum;
import Shared.IDictionary;
import Shared.ValueDescription;

public class EnginePowerDictionary implements IDictionary<EnginePowerEnum> {
	
	public static String Description = "Мощность двигателя";
	
	public List<ValueDescription<EnginePowerEnum>> GetDescriptions()
	{
		List<ValueDescription<EnginePowerEnum>> result = new ArrayList<ValueDescription<EnginePowerEnum>>();
		
		result.add(new ValueDescription<EnginePowerEnum>(EnginePowerEnum.Up50,
				"До 50 л.с"));
		result.add(new ValueDescription<EnginePowerEnum>(EnginePowerEnum.From51To70,
				"от 51 до 70 л.с"));
		result.add(new ValueDescription<EnginePowerEnum>(EnginePowerEnum.From71To100,
				"от 71 до 100 л.с"));
		result.add(new ValueDescription<EnginePowerEnum>(EnginePowerEnum.From101To120,
				"от 101 до 120 л.с"));
		result.add(new ValueDescription<EnginePowerEnum>(EnginePowerEnum.From121To150,
				"от 121 до 150 л.с"));
		result.add(new ValueDescription<EnginePowerEnum>(EnginePowerEnum.From151AndOver,
				"от 151 и более"));
			
		return result;
	}
}