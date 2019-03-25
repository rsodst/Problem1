package Dictionaries;
import java.util.ArrayList;
import java.util.List;

import Enums.PeriodOfUseEnum;
import Shared.IDictionary;
import Shared.ValueDescription;

public class PeriodOfUseDictionary implements IDictionary<PeriodOfUseEnum> {

	public String Description = "ѕериод использовани€";

	public List<ValueDescription<PeriodOfUseEnum>> GetDescriptions() {
		List<ValueDescription<PeriodOfUseEnum>> result = new ArrayList<ValueDescription<PeriodOfUseEnum>>();

		result.add(new ValueDescription<PeriodOfUseEnum>(PeriodOfUseEnum._1Year, "1 год"));
		result.add(new ValueDescription<PeriodOfUseEnum>(PeriodOfUseEnum._9Month, "9 мес€цев"));
		result.add(new ValueDescription<PeriodOfUseEnum>(PeriodOfUseEnum._8Month, "8 мес€цев"));
		result.add(new ValueDescription<PeriodOfUseEnum>(PeriodOfUseEnum._7Month, "7 мес€цев"));
		result.add(new ValueDescription<PeriodOfUseEnum>(PeriodOfUseEnum._6Month, "6 мес€цев"));
		result.add(new ValueDescription<PeriodOfUseEnum>(PeriodOfUseEnum._5Month, "5 мес€цев"));
		result.add(new ValueDescription<PeriodOfUseEnum>(PeriodOfUseEnum._4Month, "4 мес€ц€"));
		result.add(new ValueDescription<PeriodOfUseEnum>(PeriodOfUseEnum._3Month, "3 мес€ц€"));

		return result;
	}
}
