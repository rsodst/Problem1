import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import Entry.OsagoCalculatorService;
import Enums.BonusMalusEnum;
import Enums.EnginePowerEnum;
import Enums.InsurancePeriodEnum;
import Enums.PersonsAllowedToDriveEnum;
import Enums.VehicleOwnerTypeEnum;
import Enums.VehicleRegistrationCountryEnum;
import Enums.VehicleTypeEnum;
import Models.DriverDescription;
import Models.OwnerDescription;
import Models.VehicleDescription;
import Shared.ValueDescription;

public class Tests {

	private float CalcResultBashkortostan() throws Exception {
		OsagoCalculatorService osagoCalculatorService = new OsagoCalculatorService();

		VehicleDescription vehicle = new VehicleDescription();
		OwnerDescription owner = new OwnerDescription();

		vehicle.EnginePower = EnginePowerEnum.From71To100;
		vehicle.VehicleRegistrationCountry = VehicleRegistrationCountryEnum.Russia;
		vehicle.VehicleType = VehicleTypeEnum.Cars;

		owner.AreaId = 1;
		owner.RegionId = 1;

		owner.BonusMalusRate = BonusMalusEnum._1;

		owner.DriverDescription = new DriverDescription(22, 3);

		owner.InsurancePeriod = InsurancePeriodEnum._9Month;
		owner.PersonsAllowedToDrive = PersonsAllowedToDriveEnum.AnyDrivers;
		owner.VehicleOwnerType = VehicleOwnerTypeEnum.Individual;

		float result = osagoCalculatorService.Calc(vehicle, owner);

		return result;
	}

	@Test
	public void CompareWithOnlineCalculatorValue_Tinkoff() throws Exception {
		OsagoCalculatorService osagoCalculatorService = new OsagoCalculatorService();

		VehicleDescription vehicle = new VehicleDescription();
		OwnerDescription owner = new OwnerDescription();

		vehicle.EnginePower = EnginePowerEnum.From71To100;
		vehicle.VehicleRegistrationCountry = VehicleRegistrationCountryEnum.Russia;
		vehicle.VehicleType = VehicleTypeEnum.Cars;

		owner.AreaId = 1;
		owner.RegionId = 1;

		owner.BonusMalusRate = BonusMalusEnum._1;

		owner.DriverDescription = new DriverDescription(22, 3);

		owner.InsurancePeriod = InsurancePeriodEnum._9Month;
		owner.PersonsAllowedToDrive = PersonsAllowedToDriveEnum.AnyDrivers;
		owner.VehicleOwnerType = VehicleOwnerTypeEnum.Individual;

		float result = osagoCalculatorService.Calc(vehicle, owner);

		boolean hasError = false;

		if (result < 10000 || result > 16000) {
			hasError = true;
		}

		Assert.assertEquals(hasError, false);
	}

	@Test
	public void CheckThatValueIncludeToAllowedInterval() throws Exception {
		OsagoCalculatorService osagoCalculatorService = new OsagoCalculatorService();

		VehicleDescription vehicle = new VehicleDescription();
		OwnerDescription owner = new OwnerDescription();

		vehicle.EnginePower = EnginePowerEnum.From71To100;
		vehicle.VehicleRegistrationCountry = VehicleRegistrationCountryEnum.Russia;
		vehicle.VehicleType = VehicleTypeEnum.Cars;

		owner.AreaId = 1;
		owner.RegionId = 1;

		owner.BonusMalusRate = BonusMalusEnum._1;

		owner.DriverDescription = new DriverDescription(22, 3);

		owner.InsurancePeriod = InsurancePeriodEnum._9Month;
		owner.PersonsAllowedToDrive = PersonsAllowedToDriveEnum.AnyDrivers;
		owner.VehicleOwnerType = VehicleOwnerTypeEnum.Individual;

		float result = osagoCalculatorService.Calc(vehicle, owner);

		System.out.print(result);

		boolean hasError = false;

		if (result != (float) 11122.24) {
			hasError = true;
		}

		Assert.assertEquals(hasError, false);
	}
}
