/**
 * 
 */
package area;

/**
 * @author Felix W�ls
 * @version 01-12-2015
 * 
 */
public class FlaecheBerechnen {

	/**
	 * errechent den fl�chen inhalt eines rechtecks
	 * @since 01-12-2015
	 * @param l�nge des rechtecks
	 * @param breite des rechtecks
	 * @return den fl�chen inhalt
	 */
	public double flaecheRechteck(double l�nge, double breite) {
		double res = l�nge * breite;
		return res;

	}

	/**
	 * errechent den fl�chen inhalt eines kreises
	 * @param radius des kreises
	 * @return res fl�cheninhalt eines kreises
	 */
	public double fleacheKreis(double radius) {
		double res = radius * radius * Math.PI;
		return res;
	}

	/**
	 * errechent die fl�che eines dreiecks
	 * @param a seite des dreiecks
	 * @param h h�he des dreiecks
	 * @return
	 */
	public double fleacheDreieck(double a, double h) {
		double res = a * h / 2;
		return res;

	}

}
