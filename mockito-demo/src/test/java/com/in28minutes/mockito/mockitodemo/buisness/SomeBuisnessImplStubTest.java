package com.in28minutes.mockito.mockitodemo.buisness;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBuisnessImplStubTest {

	@Test
	void test() {
		DataServiceStub dataServiceStub = new DataServiceStub();
		BuisnessImpl impl = new BuisnessImpl(dataServiceStub);
		int val = impl.findGreatestFromAllData();
		System.out.println("nitin");
		assertEquals(3,val);
	}

}

class DataServiceStub implements DataService{

	@Override
	public int[] retrievalAllData() {
		// TODO Auto-generated method stub
		return new int[] {1,2,3};
	}
	
}
