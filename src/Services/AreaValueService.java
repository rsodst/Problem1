package Services;

import java.util.ArrayList;
import java.util.List;

import Shared.AreaCreator;
import Shared.AreaDetails;
import Shared.RegionDetails;

public class AreaValueService {
	public List<AreaDetails> areas = new ArrayList<AreaDetails>();

	private void Add(AreaCreator areaCreator) {
		areas.add(areaCreator.Create());
	}

	public AreaValueService() {

		Add(new AreaCreator() {
			@Override
			public AreaDetails Create() {
				List<RegionDetails> regions = new ArrayList<RegionDetails>();

				regions.add(new RegionDetails(1, "Благовещенск", (float) 1.2));
				regions.add(new RegionDetails(2, "Октябрьский", (float) 1.2));
				regions.add(new RegionDetails(3, "Ишимбай", (float) 1.1));
				regions.add(new RegionDetails(4, "Кумертау", (float) 1.1));
				regions.add(new RegionDetails(5, "Салават", (float) 1.1));
				regions.add(new RegionDetails(6, "Стерлитамак", (float) 1.3));
				regions.add(new RegionDetails(7, "Туймазы", (float) 1.3));
				regions.add(new RegionDetails(8, "Уфа", (float) 1.8));
				regions.add(new RegionDetails(9, "Прочие города", (float) 1.0));

				return new AreaDetails(1, "Республика Башкортостан", regions);
			}
		});

		Add(new AreaCreator() {
			@Override
			public AreaDetails Create() {
				List<RegionDetails> regions = new ArrayList<RegionDetails>();

				regions.add(new RegionDetails(1, "Альметьевск", (float) 1.3));
				regions.add(new RegionDetails(2, "Зеленодольск", (float) 1.3));
				regions.add(new RegionDetails(3, "Нижнекамск", (float) 1.3));
				regions.add(new RegionDetails(4, "Бугульма", (float) 1.0));
				regions.add(new RegionDetails(5, "Лениногорск", (float) 1.0));
				regions.add(new RegionDetails(6, "Чистополь", (float) 1.0));
				regions.add(new RegionDetails(7, "Елабуга", (float) 1.2));
				regions.add(new RegionDetails(8, "Казань", (float) 2.0));
				regions.add(new RegionDetails(9, "Набережные Челны", (float) 1.7));
				regions.add(new RegionDetails(10, "Прочие города", (float) 1.1));

				return new AreaDetails(2, "Республика Татарстан", regions);
			}
		});

	}

	public RegionDetails Get(int areaId, int regionId)
	{
		for (AreaDetails area : areas)
		{
			if (area.Id == areaId)
			{
				for(RegionDetails region : area.Regions)
				{
					if (region.Id == regionId)
					{
						return region;
					}
				}
			}
		}
		
		return null;
	}
	
	public AreaDetails Get(int areaId)
	{
		for (AreaDetails area : areas)
		{
			if (area.Id == areaId)
			{
				return area;
			}
		}
		
		return null;
	}
}
