public class Segitiga
{
	int alas;
	int tinggi;
	int sisimiring;

	public void CetakKeLayar()
	{
		System.out.println("Alas Segitiga: " + alas);
		System.out.println("Tinggi Segitiga: " + tinggi);
		System.out.println("Sisimiring Segitiga: " + sisimiring);

	}

	public  void ubahProperty(int alasBaru, int tinggiBaru, int sm)
	{
		alas = alasBaru;
		tinggi = tinggiBaru;
		sisimiring = sm;
	}

	public double hitungLuasSegitiga()
	{
		double luas;
		luas = ((0.5) * alas * tinggi);
		return luas;
	}

	public int hitungKelilingSegitiga()
	{
		int keliling;
		keliling = (alas + sisimiring + sisimiring);
		return keliling;
	}
}
