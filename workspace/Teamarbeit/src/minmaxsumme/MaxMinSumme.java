package minmaxsumme;
/**
 * Klasse zur berechnung des Maximums der Minumums und der Summe
 * @author Mario Ottomaier
 * @version 4.12.2015
 */
public class MaxMinSumme {


	/**
	 * Berechnet das Maximum
	 * @param a
	 * @param b
	 * @return
	 * @since 4.12.2015
	 */
	public Double Maximum(Double a,Double b){
		if (a<b){
	        return b; 
	       } else {
	        return a;
	       }
	}
	
	/**
	 * Berechnet das Minumum
	 * @param a
	 * @param b
	 * @return
	 * @since 4.12.2015
	 */
	public Double Minumum(Double a,Double b){
		if (a>b){
	        return b; 
	       } else {
	        return a;
	       }
	}

	/**
	 * Berechnet die Summe 
	 * @param a
	 * @param b
	 * @return
	 * @since 4.12.2015
	 */
	public Double Summe(Double a, Double b){
		return a+b;
	}


	
}
