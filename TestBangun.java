public class TestBangun
{
	public static void main(String[] args)
	{
		Segitiga bangun_Segitiga = new Segitiga();
		Lingkaran bangun_Lingkaran = new Lingkaran();
		
		bangun_Segitiga.alas = 10;
		bangun_Segitiga.tinggi = 10;
		bangun_Segitiga.sisimiring = 20;
		bangun_Lingkaran.jari= 10;
		bangun_Lingkaran.diameter= 20;
				
		bangun_Lingkaran.CetakKeLayar();
		System.out.println("Luas Lingkaran: " + bangun_Lingkaran.hitungLuasLingkaran());
		System.out.println("Keliling Lingkarang: " + bangun_Lingkaran.hitungKelilingLingkaran());

		bangun_Segitiga.CetakKeLayar();
		System.out.println("Luas Segitiga: " + bangun_Segitiga.hitungLuasSegitiga());
		System.out.println("Keliling Segitiga: " + bangun_Segitiga.hitungKelilingSegitiga());
		}

}