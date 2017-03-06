package edu.uniandes.ecos.psp2.dto.point;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PointTest {

	Point point = null;
	
	@Test
	public void pointTest(){
		point = new Point(1d, 2d);
		assertTrue(point != null);
	}
	
	@Test
	public void setXTest(){
		point = new Point(1d, 2d);
		point.setX(5d);
		assertTrue(point.getX() == 5d);
	}
	
	@Test
	public void setYTest(){
		point = new Point(1d, 2d);
		point.setY(5d);
		assertTrue(point.getY() == 5d);
	}
}
