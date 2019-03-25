package Services;

import java.util.ArrayList;
import java.util.List;

import Enums.InsurancePeriodEnum;
import Shared.KeyValuePair;

public class InsurancePeriodValueService {

	private List<KeyValuePair<InsurancePeriodEnum>> GetValues() {
		List<KeyValuePair<InsurancePeriodEnum>> result = new ArrayList<KeyValuePair<InsurancePeriodEnum>>();

		result.add(new KeyValuePair<InsurancePeriodEnum>(InsurancePeriodEnum._1Year, (float) 1.0));
		result.add(new KeyValuePair<InsurancePeriodEnum>(InsurancePeriodEnum._9Month, (float) 0.95));
		result.add(new KeyValuePair<InsurancePeriodEnum>(InsurancePeriodEnum._8Month, (float) 0.9));
		result.add(new KeyValuePair<InsurancePeriodEnum>(InsurancePeriodEnum._7Month, (float) 0.8));
		result.add(new KeyValuePair<InsurancePeriodEnum>(InsurancePeriodEnum._6Month, (float) 0.7));
		result.add(new KeyValuePair<InsurancePeriodEnum>(InsurancePeriodEnum._5Month, (float) 0.6));
		result.add(new KeyValuePair<InsurancePeriodEnum>(InsurancePeriodEnum._4Month, (float) 0.5));
		result.add(new KeyValuePair<InsurancePeriodEnum>(InsurancePeriodEnum._3Month, (float) 0.4));
		result.add(new KeyValuePair<InsurancePeriodEnum>(InsurancePeriodEnum._2Month, (float) 0.3));
		result.add(new KeyValuePair<InsurancePeriodEnum>(InsurancePeriodEnum._1Month, (float) 0.2));

		return result;
	}

	public float Get(InsurancePeriodEnum power) throws Exception {

		List<KeyValuePair<InsurancePeriodEnum>> keyValueMaps = GetValues();

		for (KeyValuePair<InsurancePeriodEnum> keyValueMap : keyValueMaps) {
			if (keyValueMap.Key == power) {
				return keyValueMap.Value;
			}
		}

		throw new Exception("Power value unsupported");
	}
}
