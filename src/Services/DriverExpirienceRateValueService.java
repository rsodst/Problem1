package Services;

public class DriverExpirienceRateValueService {

	public float Get(int age, int expirience) {
		if (age <= 22 && expirience <= 3) {
			return (float) 1.7;
		}

		if (age <= 22 && expirience > 3) {
			return (float) 1.3;
		}

		if (age > 22 && expirience < 3) {
			return (float) 1.5;
		}

		return 1;
	}
}
