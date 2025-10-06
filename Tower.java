package Project_ControlTower;

import java.util.Scanner;

public class Tower
{
	public static void main(String[] args) 
	{
		CollectInfo();
	}

	private static void CollectInfo()
	{
		Scanner input = new Scanner(System.in);
		Airplane plane1 = new Airplane("AAA01", 1.0, 0, 0);
		Airplane plane2 = new Airplane("AAA02", 15.8, 128, 30000);
		
		System.out.print("Enter callsign: ");
		String cs = input.nextLine().toUpperCase();
		System.out.print("Enter distance(miles): ");
		double dist = input.nextDouble();
		System.out.print("Enter bearing(degrees): ");
		int dir = input.nextInt();
		System.out.print("Enter altitude(feet): ");
		int alt = input.nextInt();
		Airplane plane3 = new Airplane(cs, dist, dir, alt);
		System.out.println("\nInitial Positions:");
		System.out.println(plane1.toString());
		System.out.println(plane2.toString());
		System.out.println(plane3.toString());
		System.out.println("\nInitial Distances:");
		System.out.println("The distance between Airplane 1 and 2 is " + plane1.distTo(plane2) + " miles");
		System.out.println("The distance between Airplane 1 and 3 is " + plane1.distTo(plane3) + " miles");
		System.out.println("The distance between Airplane 2 and 3 is " + plane2.distTo(plane3) + " miles");
		System.out.println("\nInitial Height Differences:");
		System.out.println("The difference in height between Airplane 1 and 2 is " + plane1.getAlt(plane2) + " feet");
		System.out.println("The difference in height between Airplane 1 and 3 is " + plane1.getAlt(plane3) + " feet");
		System.out.println("The difference in height between Airplane 2 and 3 is " + plane2.getAlt(plane3) + " feet");
		System.out.println("\nNew Positions:");
		double distplane = plane2.distTo(plane3);
		plane1.move(distplane, 65);
		plane2.move(8.0, 135);
		plane3.move(5.0, 55);
		plane1.gainAlt(3000);
		plane2.gainAlt(2000);
		plane3.gainAlt(4000);
		System.out.println(plane1.toString());
		System.out.println(plane2.toString());
		System.out.println(plane3.toString());
		System.out.println("\nNew Distances:");
		System.out.println("The distance between Airplane 1 and 2 is " + plane1.distTo(plane2) + " miles");
		System.out.println("The distance between Airplane 1 and 3 is " + plane1.distTo(plane3) + " miles");
		System.out.println("The distance between Airplane 2 and 3 is " + plane2.distTo(plane3) + " miles");
		System.out.println("\nNew Height Differences:");
		System.out.println("The difference in height between Airplane 1 and 2 is " + plane1.getAlt(plane2) + " feet");
		System.out.println("The difference in height between Airplane 1 and 3 is " + plane1.getAlt(plane3) + " feet");
		System.out.println("The difference in height between Airplane 2 and 3 is " + plane2.getAlt(plane3) + " feet");
	}
}
