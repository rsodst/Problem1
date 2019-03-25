package Entry;
import java.util.ArrayList;
import java.util.List;

import Models.OwnerDescription;
import Models.VehicleDescription;
import Services.AreaValueService;
import Services.BaseRateValueService;
import Services.BonusMalusValueService;
import Services.DriverExpirienceRateValueService;
import Services.EnginePowerValueService;
import Services.InsurancePeriodValueService;
import Services.PersonsAllowedToDriveValueService;

public class OsagoCalculatorService {
	AreaValueService areaValueService;
	BaseRateValueService baseRateValueService;
	DriverExpirienceRateValueService driverExpirienceRateValueService;
	EnginePowerValueService enginePowerValueService;
	InsurancePeriodValueService insurancePeriodValueService;
	PersonsAllowedToDriveValueService personsAllowedToDriveValueService;
	BonusMalusValueService bonusMalusValueService;

	public OsagoCalculatorService() {
		areaValueService = new AreaValueService();
		baseRateValueService = new BaseRateValueService();
		driverExpirienceRateValueService = new DriverExpirienceRateValueService();
		enginePowerValueService = new EnginePowerValueService();
		insurancePeriodValueService = new InsurancePeriodValueService();
		personsAllowedToDriveValueService = new PersonsAllowedToDriveValueService();
		bonusMalusValueService = new BonusMalusValueService();
	}

	public float Calc(VehicleDescription vehicleDescription, OwnerDescription ownerDescription) throws Exception
	{
		List<Float> rates = new ArrayList<Float>();
		
		rates.add(baseRateValueService.Get(vehicleDescription.VehicleType, ownerDescription.VehicleOwnerType));
		rates.add(areaValueService.Get(ownerDescription.AreaId, ownerDescription.RegionId).Rate);
		rates.add(driverExpirienceRateValueService.Get(ownerDescription.DriverDescription.Age, ownerDescription.DriverDescription.Expirience));
		rates.add(personsAllowedToDriveValueService.Get(ownerDescription.PersonsAllowedToDrive));
		rates.add(enginePowerValueService.Get(vehicleDescription.EnginePower));
		rates.add(insurancePeriodValueService.Get(ownerDescription.InsurancePeriod));
		rates.add(bonusMalusValueService.Get(ownerDescription.BonusMalusRate));
		
		float result = 1;
		
		for (float rate : rates)
		{
			result *= rate;
		}
		
		return result;
	}
}
