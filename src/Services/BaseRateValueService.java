package Services;

import Enums.VehicleOwnerTypeEnum;
import Enums.VehicleTypeEnum;

public class BaseRateValueService {

	public float Get(VehicleTypeEnum vehicleType, VehicleOwnerTypeEnum ownerType) throws Exception {
		if (vehicleType == VehicleTypeEnum.MotorcyclesAndScooters) {
			return (float) 1215;
		}

		if (vehicleType == VehicleTypeEnum.Cars && ownerType == VehicleOwnerTypeEnum.Legal) {
			return (float) 2375;
		}

		if (vehicleType == VehicleTypeEnum.Cars && ownerType == VehicleOwnerTypeEnum.Individual) {
			return (float) 1980;
		}

		if (vehicleType == VehicleTypeEnum.CarsTaxi) {
			return (float) 2965;
		}

		if (vehicleType == VehicleTypeEnum.CargoVehiclesUpTo16tons) {
			return (float) 2025;
		}

		if (vehicleType == VehicleTypeEnum.CargoVehiclesOver16tons) {
			return (float) 3240;
		}

		if (vehicleType == VehicleTypeEnum.BusesUpTo20seats) {
			return (float) 1620;
		}

		if (vehicleType == VehicleTypeEnum.BusesOver20seats) {
			return (float) 2025;
		}

		if (vehicleType == VehicleTypeEnum.BusesTaxi) {
			return (float) 2965;
		}

		throw new Exception("Vehicle type unsupported");
	}
}
