/**
 * 
 */
package area;

/**
 * @author Felix Wöls
 * @version 01-12-2015
 * 
 */
public class FlaecheBerechnen {

	/**
	 * errechent den flächen inhalt eines rechtecks
	 * @since 01-12-2015
	 * @param länge des rechtecks
	 * @param breite des rechtecks
	 * @return den flächen inhalt
	 */
	public double flaecheRechteck(double länge, double breite) {
		double res = länge * breite;
		return res;

	}

	/**
	 * errechent den flächen inhalt eines kreises
	 * @param radius des kreises
	 * @return res flächeninhalt eines kreises
	 */
	public double fleacheKreis(double radius) {
		double res = radius * radius * Math.PI;
		return res;
	}

	/**
	 * errechent die fläche eines dreiecks
	 * @param a seite des dreiecks
	 * @param h höhe des dreiecks
	 * @return
	 */
	public double fleacheDreieck(double a, double h) {
		double res = a * h / 2;
		return res;

	}

}
