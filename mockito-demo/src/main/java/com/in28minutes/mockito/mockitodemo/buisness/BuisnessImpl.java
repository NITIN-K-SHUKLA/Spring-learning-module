package com.in28minutes.mockito.mockitodemo.buisness;

public class BuisnessImpl {

	private DataService dataService;
	public BuisnessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}
	public int findGreatestFromAllData()
	{
		int[] numbers = dataService.retrievalAllData();
		int maxV = -1;
		for(int num: numbers)
		{
			if(num > maxV)
				maxV = num;
		}
		return maxV;
	}
}

interface DataService{
	int[] retrievalAllData();
}