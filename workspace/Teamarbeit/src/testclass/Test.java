package testclass;

import minmaxsumme.MaxMinSumme;
import area.FlaecheBerechnen;
import volume.CalcVolume;

/**
 * testet alle anderen klassen 
 * @author Filipovic
 * @version 1.12.15
 *
 */
public class Test {

	private static double l,b,h,r;
	private static CalcVolume V = new CalcVolume();
	private static FlaecheBerechnen A = new FlaecheBerechnen();
	private static MaxMinSumme M = new MaxMinSumme();
	public static void main(String[] args) {

		l=10; b=20; h=5;
		System.out.println("Vquader("+l+", "+b+", "+h+") = " + V.quaderVolume(l, b, h));
		l=20; b=40; h=10;
		System.out.println("Vquader("+l+", "+b+", "+h+") = " + V.quaderVolume(l, b, h));
		r=10; h=20;
		System.out.println("Vkegel("+r+", "+h+") = " + V.kegelVolume(r, h));
		r=10; h=20;
		System.out.println("Vzylinder("+r+", "+h+") = " + V.zylinderVolume(r, h));
		l=10; b=20;
		System.out.println("Vrechteck("+l+", "+b+") = " + A.flaecheRechteck(l, b));
		r=25;
		System.out.println("Vkreis("+r+") = " + A.flaecheKreis(r));
		l=10; h=23;
		System.out.println("Vdreieck("+l+", "+h+") = " + A.flaecheDreieck(l, h));
		System.out.println("Summe:" + M.Summe(l,b));
		System.out.println("Minumum:" + M.Minumum(l,b));
		System.out.println("Maximum:" + M.Maximum(l,b));
	}

}
