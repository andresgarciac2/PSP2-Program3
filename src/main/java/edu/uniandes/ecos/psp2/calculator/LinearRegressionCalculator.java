/**
 * 
 */
package edu.uniandes.ecos.psp2.calculator;

import java.util.List;

import org.apache.commons.math3.stat.regression.SimpleRegression;

import edu.uniandes.ecos.psp2.dto.point.Point;

/**
 * @author AndrésGarcía
 *
 */
public class LinearRegressionCalculator {

	public double[] calculateRegressionData(List<Point> entryData){
    	SimpleRegression regression = new SimpleRegression();
    	double[] result = new double[5];
    	for(Point p : entryData){
    		regression.addData(p.getX(), p.getY());
    	}

    	result[0] = regression.regress().getParameterEstimate(0);
    	result[1] = regression.regress().getParameterEstimate(1);
    	result[2] = regression.getR();
    	result[3] = regression.getRSquare();
        //System.out.println(regression.predict(386d));
    	
    	return result;
	}
	
}
