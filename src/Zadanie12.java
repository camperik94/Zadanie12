import java.util.Scanner;

public class Zadanie12 {
	public static void main(String[] args) {
		Licz li = new Licz();
		Scanner in = new Scanner(System.in);

		int liczba = 1;
		int min = 999999;
		int max = 1;
		int licznik = 0;
		
		while (liczba != 0) {
			liczba = in.nextInt();
			
			
			
			if(liczba == 0) {
				break;
			}
			licznik++;
			max = li.maksimum(liczba);
			min = li.minimum(liczba);
			li.funkcja(liczba);
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(li.getNumber());
		System.out.println(licznik);
		System.out.println(li.srednia(li.getNumber(), licznik));
		
		
	}
}
