
public class Licz {
	private int number;
	private int maks = 0;
	private int mini = 9999;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int funkcja(int liczba) {
		number = number + liczba;

		return number;
	}

	public int maksimum(int liczba) {
		if (liczba > maks) {
			maks = liczba;

		}
		return maks;
	}
	
	public int minimum(int liczba) {
		if (liczba < mini) {
			mini = liczba;

		}
		return mini;
	}
	
	public double srednia(int suma, int licznik) {
		
		return (double)suma / (double)licznik;
	}
}

