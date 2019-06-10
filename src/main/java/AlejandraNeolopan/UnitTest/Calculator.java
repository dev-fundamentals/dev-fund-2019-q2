package main.java.AlejandraNeolopan.UnitTest;

public class Calculator {

	public int sumar(String numbers)	{
		return 0;
	}
	public int add (String numbers) {
		char delimiter=numbers.charAt(2);
		String num[]=numbers.substring(3).split(""+delimiter);
		int result = 0;
		for (int i=0; i<num.length;i++) {
			if (Integer.parseInt( num[i])>0)
				if (Integer.parseInt( num[i])<1000)
					result+= Integer.parseInt( num[i]);
			else
				System.out.println("negatives not allowed");
		}
		return result;
	}
}
