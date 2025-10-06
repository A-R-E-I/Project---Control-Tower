package Project_ControlTower;

public class Airplane
{
	private String callsign;
	private double distance;
	private int bearing;
	private int altitude;
	
	public Airplane(String cs, double dist, int dir, int alt) 
	{
		this.callsign = cs;
		if(dist < 0)
		{
			dist = dist * -1;
		}
		this.distance = dist;
		if(alt < 0)
		{
			alt = alt * -1;
		}
		this.altitude = alt;
		this.bearing = dir % 360;
		if(bearing < 0)
		{
			bearing += 360;
		}
		
	}
	
	public void move(double dist, int dir)
	{
		double rad1 = Math.toRadians(bearing);
		double rad2 = Math.toRadians(dir);
		double x = distance * Math.cos(rad1);
		double y = distance * Math.sin(rad1);
		x += dist * Math.cos(rad2); 
		y += dist * Math.sin(rad2);
		distance = (int) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		bearing = (int) Math.round(Math.toDegrees (Math.atan2(y, x)));
		if (bearing < 0) 
		{
			bearing += 360;
		}

	}
	
	public void gainAlt(int alt)
	{
		altitude += alt;
	}
	
	public void loseAlt(int alt)
	{
		altitude -= alt;
		if (altitude < 0) 
		{
			altitude=0;
		}
	}
	
	public int getAlt(Airplane other) 
	{
		return Math.abs(altitude - other.altitude);
	}
	
	public double distTo(Airplane other) 
	{
		double rad1 = Math.toRadians(bearing);
		double rad2 = Math.toRadians(other.bearing);
		double x1 = distance * Math.cos(rad1); 
		double y1 = distance * Math.sin(rad1); 
		double x2 = other.distance * Math.cos(rad2);
		double y2 = other.distance * Math.sin(rad2);
		double dx = x2 - x1;
		double dy = y2 - y1;
		return (int) Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	}
	
	public String toString() 
	{ 
		return callsign + " - " + distance + " miles away at bearing " + bearing + "°, altitude " + altitude + " feet";
	} 

}
