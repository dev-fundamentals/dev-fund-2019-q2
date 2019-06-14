package main.java.ShayraAltamirano.Testtdd;

public class Calculator {

	public static int add(String numbers) throws Exception  {
		
		int sum=0;
		int numtemp=0;
		String negatives="";
		
		String num[]=numbers.split(",|//%\n|\n|%");
		
		if (numbers.length()>0 ) {
			for (int i =0; i<num.length;i++) {
								
				numtemp=Integer.parseInt(num[i]);
				if (numtemp<0) {
					negatives = negatives + numtemp + ",";
					System.out.println(negatives);
				}
				if (numtemp>1000) {
					numtemp=0;
				}
				sum=sum+numtemp;
			}
		}
		if(negatives.length()>0) {
			throw new Exception("Negative numbers are: " + negatives);
		}
		return sum;		
	}
}
