package edu.uniandes.ecos.psp2;

import org.apache.commons.math3.stat.regression.SimpleRegression;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SimpleRegression regression = new SimpleRegression();
    	regression.addData(130d, 186d);
    	regression.addData(650d, 699d);
    	regression.addData(99d, 132d);
    	regression.addData(150d, 272d);
    	regression.addData(128d, 291d);
    	regression.addData(302d, 331d);
    	regression.addData(95d, 199d);
    	regression.addData(945d, 1890d);
    	regression.addData(368d, 788d);
    	regression.addData(961d, 1601d);
        System.out.println(regression.getRSquare());
        System.out.println(regression.getR());
        System.out.println(regression.regress().getParameterEstimate(0));
        System.out.println(regression.regress().getParameterEstimate(1));
        System.out.println(regression.predict(386d));

    }
}
