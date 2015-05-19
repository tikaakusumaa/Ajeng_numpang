public class Lingkaran
{
	int jari;
	int diameter;

	public void CetakKeLayar()
	{
		System.out.println("Jari-Jari Lingkaran: " + jari);
		System.out.println("diameter Lingkaran: " + diameter);

	}

	public  void ubahProperty(int jariBaru, int diameterBaru)
	{
		jari = jariBaru;
		diameter = diameterBaru;
	
	}

	public double hitungLuasLingkaran()
	{
		double luas;
		luas = 3.14 * jari * jari;
		return luas;
	}

	public double hitungKelilingLingkaran()
	{
		double keliling;
		keliling = 3.14 * diameter;
		return keliling;
	}
}
