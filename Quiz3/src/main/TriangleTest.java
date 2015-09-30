package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	Triangle tester = new Triangle( 1, 2, 3) ;
	
	@Test
	public void test() {
		assertTrue("My Test of area",tester.getArea()==Math.sqrt(3 * (3 - 1) * (3 - 2) * (3 - 3)));
		assertTrue("My Test of perimeter",tester.getPerimeter()==6);
	}

}



