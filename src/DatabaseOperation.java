import java.util.Scanner;

public class DatabaseOperation {

	public static void main(String[] args) {
		Database[] poleDatabase = new Database[3];

		//vytvorit pole
		for (int i = 0; i < poleDatabase.length; i++) {
			poleDatabase[i] = new Database(i + 1);
		}

		//naplnit pole
		poleDatabase[0].setJmeno("Klimes");
		poleDatabase[0].setRok(1979);
		poleDatabase[0].setUvazek(1);

		poleDatabase[1].setJmeno("Novak");
		poleDatabase[1].setRok(1980);
		poleDatabase[1].setUvazek(0.8);

		poleDatabase[2].setJmeno("Novakova");
		poleDatabase[2].setRok(1982);
		poleDatabase[2].setUvazek(1.5);

		//vypsat obsah pole
		for (int i = 0; i < poleDatabase.length; i++) {
			System.out.println(poleDatabase[i].getJmeno());
			System.out.println(poleDatabase[i].getRok());
			System.out.println(poleDatabase[i].getUvazek());

		}

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

				//zadani uvazku
				System.out.println("Zadej dalsi uvazek:");
				Scanner sc1 = new Scanner(System.in);
				boolean jecislo1 = sc1.hasNextDouble();

				// validace vstupu na cislo double, musi se yadat s carkou 1,2
				if (jecislo1 == false) {
					System.out.println("Neni cislo");
				} else {

					double novyuvazek = sc1.nextDouble();

					System.out.println("Zadal jsi novy uvazek: " + novyuvazek);

					poleDatabase[cislo].setUvazek(novyuvazek);

				}

			}
		}

	}

}
