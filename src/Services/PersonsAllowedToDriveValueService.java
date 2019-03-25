package Services;

import Enums.PersonsAllowedToDriveEnum;

public class PersonsAllowedToDriveValueService {
	public float Get(PersonsAllowedToDriveEnum personAllowedToDrive) throws Exception {
		if (PersonsAllowedToDriveEnum.AnyDrivers == personAllowedToDrive) {
			return (float) 1.7;
		}

		if (PersonsAllowedToDriveEnum.LimitedList == personAllowedToDrive) {
			return (float) 1;
		}

		throw new Exception("PersonAllowedToDrive type not supported");
	}
}
