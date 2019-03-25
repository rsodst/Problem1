package Services;

import Enums.BonusMalusEnum;

public class BonusMalusValueService {
	public float Get(BonusMalusEnum bonusMalus) throws Exception {
		switch (bonusMalus) {
		case _M:
			return (float) 2.45;
		case _0:
			return (float) 2.3;
		case _1:
			return (float) 1.55;
		case _2:
			return (float) 1.4;
		case _3:
			return (float) 1;
		case _4:
			return (float) 0.95;
		case _5:
			return (float) 0.9;
		case _6:
			return (float) 0.85;
		case _7:
			return (float) 0.8;
		case _8:
			return (float) 0.75;
		case _9:
			return (float) 0.7;
		case _10:
			return (float) 0.65;
		case _11:
			return (float) 0.6;
		case _12:
			return (float) 0.55;
		case _13:
			return (float) 0.5;
		}

		throw new Exception("Rate not found");
	}
}
