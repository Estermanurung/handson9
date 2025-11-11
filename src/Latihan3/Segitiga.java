package latihan3;

// Implementasikan class Segitiga extends Bentuk
public class Segitiga extends Bentuk {
    // private double alas, tinggi;
    private double alas;
    private double tinggi;

    // Constructor
    // Assume segitiga siku-siku untuk hitung keliling
    public Segitiga(double alas, double tinggi) {
        super("Segitiga");
        this.alas = alas;
        this.tinggi = tinggi;
    }


    // Override hitungLuas() - return 0.5 * alas * tinggi
    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    // Override hitungKeliling()
    // Hitung sisi miring menggunakan pythagoras: Math.sqrt(alas*alas + tinggi*tinggi)
    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(alas * tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }

    // Override tampilkanInfo()
    @Override
    public void tampilkanInfo() {
        System.out.println("Bentuk: " + nama);
        System.out.println("Luas: " + nama + " (alas:" + alas + " , tinggi: " + tinggi + "):" + String.format("%.2f", hitungLuas()));
        System.out.println("Keliling: " + String.format("%.2f", hitungKeliling()));
    }
}
