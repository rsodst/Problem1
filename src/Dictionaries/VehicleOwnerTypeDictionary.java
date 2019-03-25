package Dictionaries;
import java.util.ArrayList;
import java.util.List;

import Enums.VehicleOwnerTypeEnum;
import Shared.IDictionary;
import Shared.ValueDescription;

public class VehicleOwnerTypeDictionary implements IDictionary<VehicleOwnerTypeEnum> {

	public static String Description = "Собственник транспортного средства";

	public List<ValueDescription<VehicleOwnerTypeEnum>> GetDescriptions() {
		List<ValueDescription<VehicleOwnerTypeEnum>> result = new ArrayList<ValueDescription<VehicleOwnerTypeEnum>>();

		result.add(new ValueDescription<VehicleOwnerTypeEnum>(
				VehicleOwnerTypeEnum.Individual, "Физическое лицо"));
		result.add(new ValueDescription<VehicleOwnerTypeEnum>(VehicleOwnerTypeEnum.Legal,
				"Юридическое лицо"));

		return result;
	}
}
