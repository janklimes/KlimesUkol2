
public class Database {
	Database(double uvazek)
	{
		UVAZEKMAX = 1;
		
	}
	
public double getUvazek() {
		return uvazek;
	}

	public void setUvazek(double uvazek) {
		this.uvazek = uvazek;
	}

public String getJmeno() {
		return jmeno;
	}

	public void setJmeno(String string) {
		this.jmeno = string;
	}

public int getRok() {
		return rok;
	}

	public void setRok(int rok) {
		this.rok = rok;
	}

private double uvazek;
private static double UVAZEKMAX;
private String jmeno;
private int rok;

}
