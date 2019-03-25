package Dictionaries;
import java.util.ArrayList;
import java.util.List;

import Enums.InsurancePeriodEnum;
import Shared.IDictionary;
import Shared.ValueDescription;

public class InsurancePeriodDictionary implements IDictionary<InsurancePeriodEnum> {

	public String Description = "ѕериод страховани€";

	public List<ValueDescription<InsurancePeriodEnum>> GetDescriptions() {
		List<ValueDescription<InsurancePeriodEnum>> result = new ArrayList<ValueDescription<InsurancePeriodEnum>>();

		result.add(new ValueDescription<InsurancePeriodEnum>(InsurancePeriodEnum._1Year, "1 год"));
		result.add(new ValueDescription<InsurancePeriodEnum>(InsurancePeriodEnum._9Month, "9 мес€цев"));
		result.add(new ValueDescription<InsurancePeriodEnum>(InsurancePeriodEnum._8Month, "8 мес€цев"));
		result.add(new ValueDescription<InsurancePeriodEnum>(InsurancePeriodEnum._7Month, "7 мес€цев"));
		result.add(new ValueDescription<InsurancePeriodEnum>(InsurancePeriodEnum._6Month, "6 мес€цев"));
		result.add(new ValueDescription<InsurancePeriodEnum>(InsurancePeriodEnum._5Month, "5 мес€цев"));
		result.add(new ValueDescription<InsurancePeriodEnum>(InsurancePeriodEnum._4Month, "4 мес€ц€"));
		result.add(new ValueDescription<InsurancePeriodEnum>(InsurancePeriodEnum._3Month, "3 мес€ц€"));
		result.add(new ValueDescription<InsurancePeriodEnum>(InsurancePeriodEnum._2Month, "2 мес€ц€"));
		result.add(new ValueDescription<InsurancePeriodEnum>(InsurancePeriodEnum._1Month, "1 мес€ц"));
		result.add(new ValueDescription<InsurancePeriodEnum>(InsurancePeriodEnum._15Days, "15 дней"));

		return result;
	}
}
