public class TestBarang2 {
    public static void main(String args[]){
        Barang2 barang1 = new Barang2();
        barang1.kode = "B001";
        barang1.namaBarang = "Mouse";
        barang1.hargaDasar = 100000;
        barang1.diskon = 0.1f;

        barang1.tampilData();
    }
}