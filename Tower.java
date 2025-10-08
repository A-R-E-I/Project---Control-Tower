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
		Output display = new Output();
		display.Outputs(plane1, plane2, plane3);
	}
}
