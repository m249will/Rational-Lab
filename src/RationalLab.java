// Lab09avst.java
// The Rational Class Program I
// This is the student, starting version of the Lab09a assignment.


import java.util.Scanner;


public class RationalLab
{
	private static int num, den;   // numerator and denominator of the rational number

	public static void main (String[] args)
	{
		enterData();
		Rational r = new Rational(num,den);
		r.displayData();
	}

	public static void enterData()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter the numerator ----> ");
		num = input.nextInt();
		System.out.print("\nEnter the denominator --> ");
		den = input.nextInt();
	}
}



class Rational
{
	private int reducedNum, reducedDen, gcf, firstNum, firstDen;

	public void displayData()
	{
		System.out.println();
		System.out.println(getOriginal() + " equals " + getDecimal());
		System.out.println();
		System.out.println("and reduces to " + getReduced());
		System.out.println();
	}
	
	public String getReduced()
	{
		getGCF(reducedNum,reducedDen);
		firstNum = reducedNum / gcf;
		firstDen = reducedDen / gcf;
		return firstNum + "/" + firstDen;
	}
	
	public Rational(int n, int d)
	{
		reducedNum = n;
		reducedDen = d;
	}
	
	public int getNum()
	{
		return reducedNum;
	}
	
	public int getDen()
	{
		return reducedDen;
	}
	
	public double getDecimal()
	{
		return (double) reducedNum/reducedDen;
	}
	
	public String getOriginal()
	{
		return  reducedNum + "/" + reducedDen;
	}

	private void getGCF(int n1,int n2)
	{
		int rem = 0;
		do
		{
			rem = n1 % n2;
			if (rem == 0)
				gcf = n2;
			else
			{
				n1 = n2;
				n2 = rem;
			}
		}
		while (rem != 0);
	}
}








