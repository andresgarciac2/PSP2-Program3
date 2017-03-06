package edu.uniandes.ecos.psp2.calculator;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import edu.uniandes.ecos.psp2.dto.point.Point;

public class LinearRegresionCalculatorTest {

	LinearRegressionCalculator linearRegressionCalculator = new LinearRegressionCalculator();
	
	@Test
	public void calculateRegressionDataTest1() {	 
		double[] rta = linearRegressionCalculator.calculateRegressionData(getPointsTest1(), 386d);
		assertTrue(rta[0] == -22.552532752034132);
		assertTrue(rta[1] == 1.7279324262069857);
		assertTrue(rta[2] == 0.9544965741046826);
		assertTrue(rta[3] == 0.9110637099775759);
		assertTrue(rta[4] == 644.4293837638623);
	}
	
	@Test
	public void calculateRegressionDataTest2() {	 
		double[] rta = linearRegressionCalculator.calculateRegressionData(getPointsTest2(), 386d);
		assertTrue(rta[0] == -4.038881574687582);
		assertTrue(rta[1] == 0.168126649881629);
		assertTrue(rta[2] == 0.9333068981405512);
		assertTrue(rta[3] == 0.8710617661167372);
		assertTrue(rta[4] == 60.858005279621224);
	}   
	@Test
	public void calculateRegressionDataTest3() {	 
		double[] rta = linearRegressionCalculator.calculateRegressionData(getPointsTest3(), 386d);
		assertTrue(rta[0] == -23.92388825291537);
		assertTrue(rta[1] == 1.430966943551199);
		assertTrue(rta[2] == 0.9631140931490528);
		assertTrue(rta[3] == 0.9275887564223224);
		assertTrue(rta[4] == 528.4293519578474);
	}   
	@Test
	public void calculateRegressionDataTest4() {	 
		double[] rta = linearRegressionCalculator.calculateRegressionData(getPointsTest4(), 386d);
		assertTrue(rta[0] == -4.603745423308976);
		assertTrue(rta[1] == 0.1401635263888363);
		assertTrue(rta[2] == 0.9480329874300508);
		assertTrue(rta[3] == 0.8987665452555469);
		assertTrue(rta[4] == 49.49937576278184);
	}   
	
	public List<Point> getPointsTest1(){
		List<Point> points = new ArrayList<Point>();
		points.add(new Point(130d,186d));
		points.add(new Point(650d,699d));
		points.add(new Point(99d,132d));
		points.add(new Point(150d,272d));
		points.add(new Point(128d,291d));
		points.add(new Point(302d,331d));
		points.add(new Point(95d,199d));
		points.add(new Point(945d,1890d));
		points.add(new Point(368d,788d));
		points.add(new Point(961d,1601d));
		return points;
	}
	
	public List<Point> getPointsTest2(){
		List<Point> points = new ArrayList<Point>();
		points.add(new Point(130d,15.0d));
		points.add(new Point(650d,69.9d));
		points.add(new Point(99d,6.5d));
		points.add(new Point(150d,22.4d));
		points.add(new Point(128d,28.4d));
		points.add(new Point(302d,65.9d));
		points.add(new Point(95d,19.4d));
		points.add(new Point(945d,198.7d));
		points.add(new Point(368d,38.8d));
		points.add(new Point(961d,138.2));
		return points;
	}
	public List<Point> getPointsTest3(){
		List<Point> points = new ArrayList<Point>();
		points.add(new Point(163d,186d));
		points.add(new Point(765d,699d));
		points.add(new Point(141d,132d));
		points.add(new Point(166d,272d));
		points.add(new Point(137d,291d));
		points.add(new Point(355d,331d));
		points.add(new Point(136d,199d));
		points.add(new Point(1206d,1890d));
		points.add(new Point(433d,788d));
		points.add(new Point(1130d,1601d));
		return points;
	}
	public List<Point> getPointsTest4(){
		List<Point> points = new ArrayList<Point>();
		points.add(new Point(163d,15.0d));
		points.add(new Point(765d,69.9d));
		points.add(new Point(141d,6.5d));
		points.add(new Point(166d,22.4d));
		points.add(new Point(137d,28.4d));
		points.add(new Point(355d,65.9d));
		points.add(new Point(136d,19.4d));
		points.add(new Point(1206d,198.7d));
		points.add(new Point(433d,38.8d));
		points.add(new Point(1130d,138.2d));
		return points;
	}
	
}
