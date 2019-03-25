package Dictionaries;

import java.util.ArrayList;
import java.util.List;

import Enums.BonusMalusEnum;
import Shared.IDictionary;
import Shared.ValueDescription;

public class BonusMalusDictionary implements IDictionary<BonusMalusEnum> {

	public String Description = "Класс водителя";

	public List<ValueDescription<BonusMalusEnum>> GetDescriptions() {
		List<ValueDescription<BonusMalusEnum>> result = new ArrayList<ValueDescription<BonusMalusEnum>>();

		result.add(new ValueDescription<BonusMalusEnum>(BonusMalusEnum._M, "M"));

		result.add(new ValueDescription<BonusMalusEnum>(BonusMalusEnum._0, "0"));

		result.add(new ValueDescription<BonusMalusEnum>(BonusMalusEnum._1, "1"));

		result.add(new ValueDescription<BonusMalusEnum>(BonusMalusEnum._2, "2"));

		result.add(new ValueDescription<BonusMalusEnum>(BonusMalusEnum._3, "3"));

		result.add(new ValueDescription<BonusMalusEnum>(BonusMalusEnum._4, "4"));

		result.add(new ValueDescription<BonusMalusEnum>(BonusMalusEnum._5, "5"));

		result.add(new ValueDescription<BonusMalusEnum>(BonusMalusEnum._6, "6"));

		result.add(new ValueDescription<BonusMalusEnum>(BonusMalusEnum._7, "7"));

		result.add(new ValueDescription<BonusMalusEnum>(BonusMalusEnum._8, "8"));

		result.add(new ValueDescription<BonusMalusEnum>(BonusMalusEnum._9, "9"));

		result.add(new ValueDescription<BonusMalusEnum>(BonusMalusEnum._10, "10"));

		result.add(new ValueDescription<BonusMalusEnum>(BonusMalusEnum._11, "11"));

		result.add(new ValueDescription<BonusMalusEnum>(BonusMalusEnum._12, "12"));

		result.add(new ValueDescription<BonusMalusEnum>(BonusMalusEnum._13, "13"));

		return result;
	}
}