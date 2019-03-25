package Dictionaries;
import java.util.ArrayList;
import java.util.List;

import Enums.VehicleRegistrationCountryEnum;
import Shared.IDictionary;
import Shared.ValueDescription;

public class VehicleRegistrationCountryDictionary implements IDictionary<VehicleRegistrationCountryEnum> {

	public String Description = "Регистрация ТС";

	public List<ValueDescription<VehicleRegistrationCountryEnum>> GetDescriptions() {
		List<ValueDescription<VehicleRegistrationCountryEnum>> result = new ArrayList<ValueDescription<VehicleRegistrationCountryEnum>>();

		result.add(new ValueDescription<VehicleRegistrationCountryEnum>(VehicleRegistrationCountryEnum.Russia,
				"Российская федерация"));
		result.add(new ValueDescription<VehicleRegistrationCountryEnum>(VehicleRegistrationCountryEnum.Foreign,
				"Иностранное государство"));

		return result;
	}
}
