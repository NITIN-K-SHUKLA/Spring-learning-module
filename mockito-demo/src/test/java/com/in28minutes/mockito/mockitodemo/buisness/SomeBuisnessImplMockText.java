package com.in28minutes.mockito.mockitodemo.buisness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBuisnessImplMockText {

	@Mock
	private DataService dataServiceMock;
	
	@InjectMocks
	private BuisnessImpl businessImpl;

	@Test
	void findTheGreatestFromAllData_basicScenario() {
		
//		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrievalAllData()).thenReturn(new int[] {25,15,5});
//		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		assertEquals(25, businessImpl.findGreatestFromAllData());
	}
	@Test
	void findTheGreatestFromAllData_OneValue(){
		
//		DataService dataServiceMock = mock(DataService.class);
//		dataServiceMock.retriveAllData() => new int[] {25,15,5};
		when(dataServiceMock.retrievalAllData()).thenReturn(new int[] {35});
//		DataServiceStub dataServiceStub = new DataServiceStub();
//		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		assertEquals(35, businessImpl.findGreatestFromAllData());
	}

	@Test
	void findTheGreatestFromAllData_EmptyArray(){
		
		when(dataServiceMock.retrievalAllData()).thenReturn(new int[] {});
		// Mockito.when().thenReturn(); also work
		
		assertEquals(Integer.MIN_VALUE, businessImpl.findGreatestFromAllData());
	}


}
