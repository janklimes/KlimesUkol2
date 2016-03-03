package kolo;

public class kruznice {
	kruznice(double polomer)
	{
		PI=3.141;
		this.polomer=polomer;
	}
	public static double obsahKruznice (double r)
	{
		return PI*r*r;
	}
	public double obsah ()
	{
		return obsahKruznice (polomer);
	}
	public void setPolomer(int polomer)
	{
		this.polomer=polomer;
	}
	public double getPolomer()
	{
		return polomer;
	}
	private static double PI;
	private double polomer;

}
