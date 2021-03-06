
public class Database {
	private double uvazek;
	private static double maxUvazek = 1;
	private String jmeno;
	private int rok;
	
	public static void setMaxUvazek(double maxUvazek){
		maxUvazek = maxUvazek;
	}

	Database(String jmeno, int rok) {
		this.jmeno = jmeno;
		this.rok = rok;
	}

	public boolean zadejNovyUvazek(double newUvazek) {
		double soucet = newUvazek + this.uvazek;
		if (soucet > maxUvazek) {
			return false;
		} else {
			this.uvazek = this.uvazek + newUvazek;
			return true;
		}
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

}
