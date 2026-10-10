package OOP.Jobsheet07.Task1;

public class Utama2 {
    public static void main(String[] args) {
        System.out.println("Program Testing Class Manusia, Dosen & Mahasiswa");
        Manusia dsn = new Dosen();
        Manusia mhs = new Mahasiswa();

        System.out.println("------------");
        dsn.bernafas();
        dsn.makan();
        ((Dosen) dsn).lembur();

        System.out.println("------------");
        mhs.bernafas();
        mhs.makan();
        ((Mahasiswa) mhs).tidur();
        System.out.println("------------");
    }
}