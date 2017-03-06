package edu.uniandes.ecos.psp2.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.uniandes.ecos.psp2.calculator.LinearRegressionCalculator;
import edu.uniandes.ecos.psp2.dto.point.Point;

/**
 * Clase para leer archivos y retornar resultados de la ejecucion
 * 
 * @author AndrésGarcía
 * @version 0.0.1
 */
public class Reader {
	
	List<Point> points = new ArrayList<Point>();
	LinearRegressionCalculator linearRegresionCalculator = new LinearRegressionCalculator();
	double predict = 0; 
	
	
	/**
	 * metodo que lee un archivo 
	 * 
	 * @param path
	 * @param name
	 */
	public void fileReader(String path,String name) {
		BufferedReader br = null;
		FileReader fr = null;

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				String[] parts;
				if(sCurrentLine.contains("predict")){
					parts = sCurrentLine.split("=");
					this.predict = Double.parseDouble(parts[1]);
				}else{
					parts = sCurrentLine.split(",");
					points.add(new Point(Double.parseDouble(parts[0]), Double.parseDouble(parts[1])));
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
				if (fr != null)fr.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	/**
	 * metodo recursivo que igresa por todos los folders
	 * @param folder
	 */
	public void listFilesForFolder(final File folder) {
		fileReader(folder.getAbsolutePath(),folder.getName());

	}
	/**
	 * Retorna el resultado de la ejecucion
	 * 
	 * @return
	 */
	public double[] getResults(){
		return linearRegresionCalculator.calculateRegressionData(points,this.predict);
	}
	
	
}
