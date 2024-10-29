package Set;

public class Pelanggan {

    private String	nama;		// variabel instance
    private String	sapaan;

    private int points;

    public Pelanggan(String nama, String sapaan) {	// konstruktor
        this.nama   = nama;
        this.sapaan = sapaan;
    }

    public void sapa() {
        System.out.printf("Selamat datang, %s %s!\n", sapaan, nama);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSapaan() {
        return sapaan;
    }

    public void setSapaan(String sapaan) {
        this.sapaan = sapaan;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(double nilaiTransaksi) {
        if (nilaiTransaksi > 0) {
            this.points += (int)(nilaiTransaksi/25000);
        }
    }
}
