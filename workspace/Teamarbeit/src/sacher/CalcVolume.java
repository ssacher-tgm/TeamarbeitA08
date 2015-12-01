package sacher;

public class CalcVolume {
	
	/**
	 * 
	 * @param l
	 * @param b
	 * @param h
	 * @return quaderV
	 */
	public Double quaderVolume(Double l, Double b, Double h) {
		Double quaderV = l*b*h;
		return quaderV;
	}
	
	/**
	 * 
	 * @param r
	 * @param h
	 * @return kegelV
	 */
	public Double kegelVolume(Double r, Double h) {
		Double kegelV = (1/3)*Math.PI*Math.pow(r, 2)*h;
		return kegelV;
	}
	
	/**
	 * 
	 * @param r
	 * @param h
	 * @return zylinderV
	 */
	public Double zylinderVolume(Double r, Double h) {
		Double zylinderV = Math.PI*Math.pow(r, 2)*h;
		return zylinderV;
	}
}
