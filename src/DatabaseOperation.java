import java.util.Scanner;

public class DatabaseOperation {

	public static void main(String[] args) {
		Database d1 = new Database(args[0], Integer.valueOf(args[1]));
		Database d2 = new Database(args[2], Integer.valueOf(args[3]));
		Database d3 = new Database(args[4], Integer.valueOf(args[5]));

		Database[] poleDatabase = new Database[3];
		poleDatabase[0] = d1;
		poleDatabase[1] = d2;
		poleDatabase[2] = d3;

		for (;;) // nekonecna smycka
		{
			System.out.println("Zadej id:");
			Scanner sc = new Scanner(System.in);
			boolean jecislo = sc.hasNextInt();

			// validace vstupu na cislo int
			if (jecislo == false) {
				System.out.println("Neni cislo");
			} else {

				int cislo = sc.nextInt();

				System.out.println("Zadal jsi id: " + cislo);

				System.out.println(poleDatabase[cislo].getJmeno());
				System.out.println(poleDatabase[cislo].getRok());
				System.out.println(poleDatabase[cislo].getUvazek());

				// zadani uvazku
				System.out.println("Zadej dalsi uvazek:");
				Scanner sc1 = new Scanner(System.in);
				boolean jecislo1 = sc1.hasNextDouble();

				// validace vstupu na cislo double, musi se zadat s carkou 1,2
				if (jecislo1 == false) {
					System.out.println("Neni cislo");
				} else {
					//pridani uvazku pres metodu tridy
					double novyuvazek = sc1.nextDouble();
					boolean podariloSe = poleDatabase[cislo].zadejNovyUvazek(novyuvazek);
					if (podariloSe == true) {
						System.out.println(poleDatabase[cislo].getJmeno());
						System.out.println(poleDatabase[cislo].getRok());
						System.out.println(poleDatabase[cislo].getUvazek());

					} else {
						System.out.println("Nepodarilo se, prekrocen maximalni limit uvazku!");
					}

				}

			}
		}

	}

}
