
package edu.uniandes.ecos.psp2.calculator;

import java.util.List;

import org.apache.commons.math3.stat.regression.SimpleRegression;

import edu.uniandes.ecos.psp2.dto.point.Point;

/**
 * 
 * Clase para calcular los valores solicitados por el enunciado
 * @author AndrésGarcía
 *@version 0.0.1
 */
public class LinearRegressionCalculator {

	/**
	 * 
	 * Calcula y retorna los valores usando uso de Apache common Math
	 * 
	 * @param entryData
	 * @param predict
	 * @return
	 */
	public double[] calculateRegressionData(List<Point> entryData,double predict){
    	SimpleRegression regression = new SimpleRegression();
    	double[] result = new double[5];
    	for(Point p : entryData){
    		regression.addData(p.getX(), p.getY());
    	}

    	result[0] = regression.regress().getParameterEstimate(0);
    	result[1] = regression.regress().getParameterEstimate(1);
    	result[2] = regression.getR();
    	result[3] = regression.getRSquare();
    	result[4] = regression.predict(predict);
    	
    	return result;
	}
	
}
