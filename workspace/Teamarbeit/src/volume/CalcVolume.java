package volume;
/**
 * berechnet Volumen von drei geo. Objekten
 * @author Sebastian Sacher
 * @version 02.12.2015
 */
public class CalcVolume {
	
	/**
	 * berechnet das Volumen eines Quaders
	 * @param länge
	 * @param breite
	 * @param höhe
	 * @return quaderV
	 */
	public double quaderVolume(double l, double b, double h) {
		return l*b*h;
	}
	
	/**
	 * berechnet das Volumen eines Kegels
	 * @param radius
	 * @param höhe
	 * @return kegelV
	 */
	public double kegelVolume(double r, double h) {
		return (Math.PI*Math.pow(r, 2)*h)*(1/3.0);
	}
	
	/**
	 * berechnet das Volumen eines Zylinders
	 * @param radius
	 * @param höhe
	 * @return zylinderV
	 */
	public double zylinderVolume(double r, double h) {
		return Math.PI*Math.pow(r, 2)*h;
	}
}
