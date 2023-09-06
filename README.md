# CS.12.01-Tutorial.1.2.7

This question involves identifying and processing the digits of a non-negative integer. The declaration of the Digits class is shown below. You will write the constructor and one method for the Digits class. 

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num) 
	{
		
		// To be implemented.

	}


	public boolean isStrictlyIncreasing()
	{

		// To be implemented.

	}

}

a) Write the constructor for the Digits class. The constructor initialises and fills digitList with the digits from the non-negative integer num. The elements in digitList must be Integer objects representing single digits, and appear in the same order as the digits in num. Each of the following examples shows the declaration of a Digits object and the contents of digitList as initialised by the constructor. 

Example 1

Digits d1 = new Digits(15704);

![image](https://github.com/techarenz/CS.12.01-Tutorial.1.2.7/assets/57818506/bf7fab7f-deab-4b00-aa15-6de92ff4b59c)

Example 2

Digits d2 = new Digits(0);

![image](https://github.com/techarenz/CS.12.01-Tutorial.1.2.7/assets/57818506/9394d50e-96c8-4ded-b42e-94987ddcf82a)

b) Write the Digits method isStrictlyIncreasing. The method returns true if the elements of digitList appear in strictly increasing order; otherwise, it returns false. A list is considered strictly increasing if each element after the first is greater than (but not equal to) the preceding element. 

The following table shows the results of several calls to isStrictlyIncreasing.

![image](https://github.com/techarenz/CS.12.01-Tutorial.1.2.7/assets/57818506/71ee91be-15cc-40ba-97d1-c519424999cf)

