package Services;

import java.util.ArrayList;
import java.util.List;

import Enums.EnginePowerEnum;
import Shared.KeyValuePair;

public class EnginePowerValueService {

	public float Get(EnginePowerEnum power) throws Exception {

		List<KeyValuePair<EnginePowerEnum>> keyValueMaps = GetValues();

		for (KeyValuePair<EnginePowerEnum> keyValueMap : keyValueMaps) {
			if (keyValueMap.Key == power) {
				return keyValueMap.Value;
			}
		}

		throw new Exception("Power value unsupported");
	}

	private List<KeyValuePair<EnginePowerEnum>> GetValues() {
		List<KeyValuePair<EnginePowerEnum>> result = new ArrayList<KeyValuePair<EnginePowerEnum>>();

		result.add(new KeyValuePair<EnginePowerEnum>(EnginePowerEnum.Up50, (float) 0.6));
		result.add(new KeyValuePair<EnginePowerEnum>(EnginePowerEnum.From51To70, (float) 1.0));
		result.add(new KeyValuePair<EnginePowerEnum>(EnginePowerEnum.From71To100, (float) 1.1));
		result.add(new KeyValuePair<EnginePowerEnum>(EnginePowerEnum.From101To120, (float) 1.2));
		result.add(new KeyValuePair<EnginePowerEnum>(EnginePowerEnum.From121To150, (float) 1.4));
		result.add(new KeyValuePair<EnginePowerEnum>(EnginePowerEnum.From151AndOver, (float) 1.6));

		return result;
	}
}
