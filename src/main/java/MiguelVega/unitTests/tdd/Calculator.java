package main.java.MiguelVega.unitTests.tdd;

/*
Create a simple String calculator with a method:

int add(string numbers)//”1,2,3” = 6

TDD - Requirements

The method can take 0, 1 or 2 numbers,and will return their sum 
(for an empty string it will return 0) 
for example “” or “1” or “1,2”

1. TDD - Requirements

Allow the Add method to handle an
unknown amount of numbers

i.e: add(“1,2,3,4,5”) = 15

2. TDD - Requirements

Allow the Add method to handle new lines
between numbers (instead of commas).

The following input is ok: “1\n2,3” (will equal 6)

3. TDD - Requirements

Support different delimiters -> To change a delimiter, the
beginning of the string will contain a separate line.

That looks like this: “//[delimiter]\n[numbers…]”

for example “//;\n1;2” should return three where the default
delimiter is ‘;’ .

4. TDD - Requirements

Calling Add with a negative number will throw
an exception “negatives not allowed” – and the
negative that was passed.

If there are multiple negatives, show all of them
in the exception message.

5. TDD - Requirements

Numbers bigger than 1000 should be
ignored.

i.e. adding 2 + 1001 = 2

6. TDD - Requirements

Delimiters can be of any length with the
following format: “//[delimiter]\n”

for example: “//[—]\n1—2—3” should return 6

TDD - Requirements

Allow multiple delimiters like this:
“//[delim1][delim2]\n”

for example “//[-][%]\n1-2%3” should return 6.
 */

public class Calculator {
	
		public static int add(String numbers) throws Exception {
			String[] numbersArray;			
			String negativeNumbers = "";
			String defaultSeparator = ",|\n";
			
			int result = 0;

			if (numbers != null && numbers.length() > 0) 
			{	
				//if (defaultSeparator == ",|\n")
				//{
					
				
				 numbersArray = numbers.split(defaultSeparator);
				//numbersArray = numbers.split("\n|,");
				 //numbersArray = numbers.split("\n");
      			 //numbersArray = numbers.split(",");
				/*}
				else if (defaultSeparator == ":")
				{
					
					numbersArray = numbers.split(":|\n");
				}
				else if (defaultSeparator == ";")
				{
					
					numbersArray = numbers.split(";|\n");
				}
				else if (defaultSeparator == ",")
				{
					
					numbersArray = numbers.split(",|\n");
				}			
				*/
				

			  for(String current : numbersArray)
			  {
				 int number = Integer.valueOf(current);
				  if (number < 0) {
					  negativeNumbers += (negativeNumbers.length() > 0 ? "," : "") + number;
				  }else if (number <= 1000)
				  {
					  result += number;
				  }		  
			  }
			}
			if (negativeNumbers.length() > 0) {
				throw new Exception("Negative numbers are: " + negativeNumbers);
			}
			return result;
		}

}
	


