package kr.itedu.ex10.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest {

	@Test
	void test() {
		
		assertEquals(10,Calc.sum(6, 4));
		assertEquals(11,Calc.sum(5, 6));
		assertEquals(12,Calc.sum(6, 6));
	}

}
