package Assignment;

public class MainTugasMandiri {
    public static void main(String[] args) {
        Buku buku = new Buku("Laskar Pelangi", "Andrea Hirata");
        Anggota anggota = new Anggota("Budi", "A001");

        Peminjaman peminjaman = new Peminjaman(buku, anggota);
        peminjaman.setHariTerlambat(3);

        Petugas petugas = new Petugas("Siti");
        petugas.cetakBukti(peminjaman);
    }
}