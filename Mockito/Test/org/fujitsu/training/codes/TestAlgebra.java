package org.fujitsu.training.codes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.atMost;

@ExtendWith(MockitoExtension.class)
public class TestAlgebra {

	@Mock //problematic
	private Mathematics math;
	
	@InjectMocks // used for testing need nakainstantiate
	private Algebra algebra = new Algebra(math);
	
	
	@Test
	public void testGetExpression01() {
		
		//when(math.div(10, 0)).thenReturn(0);
		
		Assertions.assertEquals(2000,algebra.getExpression(10, 0));
		
		verify(math, atMost(2)).div(10, 0);
	}
}
