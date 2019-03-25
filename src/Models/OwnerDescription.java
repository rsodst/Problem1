package Models;
import Enums.BonusMalusEnum;
import Enums.InsurancePeriodEnum;
import Enums.PersonsAllowedToDriveEnum;
import Enums.VehicleOwnerTypeEnum;

public class OwnerDescription {
	public VehicleOwnerTypeEnum VehicleOwnerType;
    public int AreaId; 
    public int RegionId; 
    public BonusMalusEnum BonusMalusRate;
    public PersonsAllowedToDriveEnum PersonsAllowedToDrive;
    public InsurancePeriodEnum InsurancePeriod; 
    public DriverDescription DriverDescription; 
}
