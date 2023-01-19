import java.util.Scanner;
class Areacalculator
{
	public static void main (String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("===============================================");
		System.out.println("               WLCOME TO");
		System.out.println("             Area CALCULATOR");
		System.out.println("===============================================");
		System.out.println("       "+(char)4+"Enter 1 for circle");
		System.out.println("       "+(char)4+"Enter 2 for Tringle");
		System.out.println("       "+(char)4+"Enter 3 for Square");
		System.out.println("       "+(char)4+"Enter 4 for rectrangle");
		System.out.println("Enter any number");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		int choice =scan.nextInt();
		if (choice==1)
		{
			System.out.println("you have selected Circle area");
			System.out.println("enter Radius of circle");
			double r = scan.nextDouble();
			double area1 = 3.14*r*r;
			System.out.println("Area of circle is :"+area1);
		}
		else if (choice ==2)
		{
			System.out.println("You have selected Tringle");
						System.out.println("enter Radius of trangle");
			double r = scan.nextDouble();
			double area1 = 3.14*r*r;
			System.out.println("Area of trangle is :"+area1);
		}
		else if (choice==3)
		{
			System.out.println(" You have selected Square");
						System.out.println("enter Radius of Square");
			double r = scan.nextDouble();
			double area1 = 3.14*r*r;
			System.out.println("Area of Square is :"+area1);
		}
		else if (choice ==4)
		{
			System.out.println("Your have selected Rectrangle");
						System.out.println("enter Radius of Rectrangle");
			double r = scan.nextDouble();
			double area1 = 3.14*r*r;
			System.out.println("Area of Rectringle is :"+area1);
		}
		else 
		{
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("          Enter Valid input");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		}
		System.out.println("Thank you..... "+(char)2);
	
	}
}
