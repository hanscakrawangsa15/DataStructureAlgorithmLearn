package Set;

public class PelangganGold extends Pelanggan {

	private String birthMonth;
	
	public PelangganGold(String nama, String sapaan, String birthMonth) {
		super(nama, sapaan);
		this.birthMonth = birthMonth;
	}
	
	public void greetAtBirthMonth(String currentMonth) {
		if (currentMonth == birthMonth)
			System.out.println("Selamat, pada bulan ini "
					+ "Anda akan mendapatkan bonus tambahan poin setiap melakukan pembelanjaan.");
	}
	
	// Contoh overriding
	public void sapa() {
		super.sapa();
		System.out.println("Senang sekali berjumpa lagi dengan Anda hari ini.");
	}
	
	// Contoh overloading
	public void setPoints(double nilaiTransaksi, String currentMonth) {
		super.setPoints(nilaiTransaksi);
		if (currentMonth == birthMonth) {
			super.setPoints(25000);
		}
	}
	
	

}
