package Assignment;

public class Petugas {
    private String nama;

    public Petugas(String nama) {
        this.nama = nama;
    }

    public void cetakBukti(Peminjaman peminjaman) {
        System.out.println("Bukti dicetak oleh petugas " + nama);
        System.out.println(peminjaman.cetakInfo());
    }
}