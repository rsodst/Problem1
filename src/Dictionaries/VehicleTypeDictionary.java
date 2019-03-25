package Dictionaries;
import java.util.ArrayList;
import java.util.List;

import Enums.VehicleTypeEnum;
import Shared.IDictionary;
import Shared.ValueDescription;

public class VehicleTypeDictionary implements IDictionary<VehicleTypeEnum> {

	public String Description = "Транспортное средство";

	public List<ValueDescription<VehicleTypeEnum>> GetDescriptions() {
		List<ValueDescription<VehicleTypeEnum>> result = new ArrayList<ValueDescription<VehicleTypeEnum>>();

		result.add(new ValueDescription<VehicleTypeEnum>(VehicleTypeEnum.MotorcyclesAndScooters,
				"Мотоциклы и мотороллеры"));
		result.add(new ValueDescription<VehicleTypeEnum>(VehicleTypeEnum.Cars, "Легковые автомобили"));
		result.add(new ValueDescription<VehicleTypeEnum>(VehicleTypeEnum.CarsTaxi, "Легковые автомобили - такси"));
		result.add(new ValueDescription<VehicleTypeEnum>(VehicleTypeEnum.CargoVehiclesUpTo16tons,
				"Грузовые ТС до 16 тонн"));
		result.add(new ValueDescription<VehicleTypeEnum>(VehicleTypeEnum.CargoVehiclesOver16tons,
				"Грузовые ТС свыше 16 тонн"));
		result.add(new ValueDescription<VehicleTypeEnum>(VehicleTypeEnum.BusesUpTo20seats, "Автобусы до 20 мест"));
		result.add(new ValueDescription<VehicleTypeEnum>(VehicleTypeEnum.BusesOver20seats, "Автобусы свыше 20 мест"));
		result.add(new ValueDescription<VehicleTypeEnum>(VehicleTypeEnum.TractorsAndOtherMachines,
				"Тракторы и иные машины"));
		result.add(new ValueDescription<VehicleTypeEnum>(VehicleTypeEnum.BusesTaxi, "Автобусы - такси"));

		return result;
	}
}
