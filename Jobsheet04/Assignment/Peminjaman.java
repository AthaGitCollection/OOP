package Assignment;

public class Peminjaman {
    private Buku buku; 
    private Anggota anggota;
    private Denda denda; 
    private int hariTerlambat;

    public Peminjaman(Buku buku, Anggota anggota) {
        this.buku = buku;
        this.anggota = anggota;
        this.denda = new Denda();
        this.hariTerlambat = 0;
    }

    public void setHariTerlambat(int hariTerlambat) {
        this.hariTerlambat = hariTerlambat;
    }

    public String cetakInfo() {
        String info = "";
        info += buku.info() + "\n";
        info += "Peminjam: " + anggota.getNama() + " (" + anggota.getNoAnggota() + ")\n";
        info += "Denda: " + denda.hitungDenda(hariTerlambat);
        return info;
    }
}