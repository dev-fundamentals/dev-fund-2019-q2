package main.java.MiguelVega;

public class CheckPassFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		
//     1. Write a program called CheckPassFail which prints "PASS" if the int variable "mark" is more than or equal to 50; or prints "FAIL" otherwise. The program shall always print “DONE” before exiting.
		 
		int mark=50;
		
		if(mark>=50)
		{
			System.out.println("PASS");
			
		}
		
		else
		{
			System.out.println("FAIL");
		}
		
		System.out.println("DONE");

//		2.With a for loop, iterate from 1 to 10 and print each value
	
		
		for (i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
//      3.	With a for loop, iterate from 1 to 10 and print each literal value 	
		
		String a= "uno", b= "dos",c= "tres",d= "cuatro",e= "cinco",f= "seis",g="siete",h= "ocho",j= "nueve",k= "diez";
		
		for (i=1;i<=10;i++)
		{
			if (i==1)
			{
				System.out.println(a);	
			}
			else
			if (i==2)
			{
				System.out.println(b);	
			}
			else
			if (i==3)
			{
				System.out.println(c);	
			}
			else
			if (i==4)
			{
				System.out.println(d);
			}
			else
			if (i==5)
			{
				System.out.println(e);	
			}
			else
			if (i==6)
			{
				System.out.println(f);	
			}
			else
			if (i==7)
			{
				System.out.println(g);	
			}
			else
			if (i==8)
			{
				System.out.println(h);	
			}
			else
			if (i==9)
			{
				System.out.println(j);	
			}
			else
			if (i==10)
			{
				System.out.println(k);
			}			 
		}
		
//      4.	With a for loop, iterate from 1 to 10 and print the each number adding if it is even or odd
		int p=0, in=0;
		for (i=1;i<=10;i++)
		{
			if (i%2==0)
			{
				p+=i;
				System.out.println("adding even: "+p);
			}		
			else 
			{
				in+=i;
				System.out.println("adding odd: "+in);
			}
			
		}	
		
// 		5.	With while loop, iterate from 1 to 1000 and print the numbers multiple of 50
		i=0;
		while (i<=1000)
		{
			if (i%50==0)
			{
				System.out.println(i);
			}	
			i+=1;
		}
			
	}
}