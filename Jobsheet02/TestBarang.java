public class TestBarang {
    public static void main (String args[]){
        Barang brgl=new Barang();
        brgl.namaBrg="Pensil";
        brgl.jenisBrg="ATK";
        brgl.stok=10;
        brgl.tampilBarang();

        System.out.println("Stok Baru adalah : "  +brgl.tambahStok(20));

        
    }
}
