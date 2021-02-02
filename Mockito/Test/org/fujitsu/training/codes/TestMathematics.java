package org.fujitsu.training.codes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.anyInt;

@ExtendWith(MockitoExtension.class)
public class TestMathematics {
	
	@Mock
	private Mathematics math;
	
	@Mock
	private ArrayList<String> arList = new ArrayList<>();
	
	
	@BeforeEach
	public void setup() {
		
	}
	
	@AfterEach
	public void teardown() {
		
	}
	
//	@ParameterizedTest
//	@ValueSource(ints = {10, 0 , 60, 50}) 
	@Test
	public void testDiv01() {
		
		when(math.div(10, 10)).thenReturn(1);
		when(math.div(10, 0)).thenReturn(0);
		when(math.div(10, 50)).thenReturn(60);
		when(math.div(10, 60)).thenReturn(70);
		
		Assertions.assertEquals(1, math.div(10,10));
		Assertions.assertEquals(0, math.div(10,0));
		Assertions.assertEquals(60, math.div(10,50));
		Assertions.assertEquals(70, math.div(10,60));
		
//		System.out.println(math.div(10,10));
//		System.out.println(math.div(10,0));
//		System.out.println(math.div(10,50));
//		System.out.println(math.div(10,0));
		
	}
	
	@Test
	public void testDiv02() {
		
		doReturn("Fe").when(arList).get(0);  //walang pake sa type ng return value Obj type
		//when(arList.get(0)).thenReturn(100); sticter assumptions ng return type for transactions/computations
		Assertions.assertEquals("Fe", arList.get(0));
	}
	
	@Test
	public void testDiv03() {
		when(math.div(10, 0)).thenThrow(ArithmeticException.class);
		Assertions.assertThrows(ArithmeticException.class, () -> {
			math.div(10, 2);
		});
	}
	
	@Test
	public void testDiv04() {
		doNothing().when(math).display();
		math.display();
		
	}
	
	
	

}
