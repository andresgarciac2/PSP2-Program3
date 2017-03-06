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
 * @author AndrésGarcía
 *
 */
public class Reader {
	
	List<Point> points = new ArrayList<Point>();
	LinearRegressionCalculator lr = new LinearRegressionCalculator();
	
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
				String[] parts = sCurrentLine.split(",");
				points.add(new Point(Double.parseDouble(parts[0]), Double.parseDouble(parts[1])));
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
		/*for (final File fileEntry : folder.listFiles()) {
			if (fileEntry.isDirectory()) {
				listFilesForFolder(fileEntry);
			} else {
				if(fileEntry.getName().contains(".java"))fileReader(fileEntry.getAbsolutePath(),fileEntry.getName());
			}
		}*/
	}
	public double[] getResults(){
		return lr.calculateRegressionData(points);
	}
	
	
}
