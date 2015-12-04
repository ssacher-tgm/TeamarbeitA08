package minmaxsumme;

public class MaxMinSumme {


	public Double Maximum(Double a,Double b){
		if (a<b){
	        return b; 
	       } else {
	        return a;
	       }
	}
	
	public Double Minumum(Double a,Double b){
		if (a>b){
	        return b; 
	       } else {
	        return a;
	       }
	}

	public Double Summe(Double a, Double b){
		return a+b;
	}


	
}
