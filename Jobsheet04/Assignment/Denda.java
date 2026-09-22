package Assignment;

public class Denda {
    private int nominalPerHari;

    public Denda() {
        this.nominalPerHari = 2000;
    }

    public int hitungDenda(int hariTerlambat) {
        if (hariTerlambat <= 0) {
            return 0;
        }
        return hariTerlambat * nominalPerHari;
    }
}