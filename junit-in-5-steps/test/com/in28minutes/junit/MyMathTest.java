package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyMathTest {

	List<String> num = Arrays.asList("nitin", "jatin");
	@Test
	void test() {

		int[] numbers = {1,2,3};
		MyMath math = new MyMath();
		int res = math.calculate(numbers);
		int expectedRes = 6;
		System.out.println(res);
		boolean b = true;
		assertArrayEquals(new int[] {1,2,3}, numbers);
	}

}
