package testclass;

import area.FlaecheBerechnen;
import volume.CalcVolume;

/**
 * testen aller anderen klassen 
 * @author Filipovic
 * @version 1.12.15
 *
 */
public class Test {

	private static CalcVolume t1 = new CalcVolume();
	private static FlaecheBerechnen t2 = new FlaecheBerechnen();
	
	public static void main(String[] args) {
		
		
		System.out.println(t1.quaderVolume(12.4,33.2,12.1));
		System.out.println(t1.quaderVolume(19.4,2.0,100.0));
		System.out.println(t1.zylinderVolume(19.4,2.0));
		System.out.println(t2.flaecheRechteck(19.4,2.0));
		System.out.println(t2.fleacheKreis(19.4));
		

	}

}
