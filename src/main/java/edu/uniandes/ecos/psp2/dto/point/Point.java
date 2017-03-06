package edu.uniandes.ecos.psp2.dto.point;

/**
 * DTO que representa un punto para calculo de la regresion lineal
 * @author AndrésGarcía
 *
 */
public class Point {

	
	/**
	 * 
	 * Variables publicas
	 */
	double x;
	double y;
	
	/**
	 * 
	 * Metodo constructor
	 * @param x
	 * @param y
	 */
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Retorna valor eje x
	 * @return the x
	 */
	public double getX() {
		return x;
	}
	/**
	 * 
	 * Cambia valor eje x
	 * @param x the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}
	/**
	 * 
	 * Retorna valor eje y
	 * @return the y
	 */
	public double getY() {
		return y;
	}
	/**
	 * 
	 * Cambia valor eje y
	 * @param y the y to set
	 */
	public void setY(double y) {
		this.y = y;
	}

	
	
	
	
	
}
