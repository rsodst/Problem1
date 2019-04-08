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

	@Test
	public void CalcResultForBashkortostanForMotorBike() throws Exception {
		OsagoCalculatorService osagoCalculatorService = new OsagoCalculatorService();

		VehicleDescription vehicle = new VehicleDescription();
		OwnerDescription owner = new OwnerDescription();

		vehicle.EnginePower = EnginePowerEnum.From71To100;
		vehicle.VehicleRegistrationCountry = VehicleRegistrationCountryEnum.Russia;
		vehicle.VehicleType = VehicleTypeEnum.MotorcyclesAndScooters;

		owner.AreaId = 1;
		owner.RegionId = 1;

		owner.BonusMalusRate = BonusMalusEnum._1;

		owner.DriverDescription = new DriverDescription(22, 3);

		owner.InsurancePeriod = InsurancePeriodEnum._9Month;
		owner.PersonsAllowedToDrive = PersonsAllowedToDriveEnum.AnyDrivers;
		owner.VehicleOwnerType = VehicleOwnerTypeEnum.Individual;

		float result = osagoCalculatorService.Calc(vehicle, owner);

		boolean hasError = false;

		if (Math.round(result) != 3643) {
			hasError = true;
		}

		Assert.assertEquals(hasError, false);
	}

	@Test
	public void CheckBehaviourInOutOFRangeCoef() throws Exception {
		OsagoCalculatorService osagoCalculatorService = new OsagoCalculatorService();

		VehicleDescription vehicle = new VehicleDescription();
		OwnerDescription owner = new OwnerDescription();

		vehicle.EnginePower = EnginePowerEnum.From71To100;
		vehicle.VehicleRegistrationCountry = VehicleRegistrationCountryEnum.Russia;
		vehicle.VehicleType = VehicleTypeEnum.Cars;

		owner.AreaId = 1;
		owner.RegionId = 1;

		owner.BonusMalusRate = BonusMalusEnum._1;

		owner.DriverDescription = new DriverDescription(25, 19);

		owner.InsurancePeriod = InsurancePeriodEnum._9Month;
		owner.PersonsAllowedToDrive = PersonsAllowedToDriveEnum.AnyDrivers;
		owner.VehicleOwnerType = VehicleOwnerTypeEnum.Individual;

		float result = osagoCalculatorService.Calc(vehicle, owner);

		boolean hasError = false;

		if (Math.round(result) != 11122) {
			hasError = true;
		}

		Assert.assertEquals(hasError, false);
	}
}