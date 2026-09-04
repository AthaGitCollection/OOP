public class TestLingkaran {
    public static void main(String[] args) {
        Lingkaran lingkaran1 = new Lingkaran();
        lingkaran1.r = 7;

        System.out.println("Luas\t\t:" + lingkaran1.hitungluas());
        System.out.println("Keliling\t:" + lingkaran1.hitungKeliling());
    }
}
