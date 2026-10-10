package OOP.Jobsheet07.Task1;

public class Utama {
    public static void main(String[] args) {
        System.out.println("Program Testing Class Segitiga");
        Segitiga sg = new Segitiga();

        System.out.println("Total Sudut (1 parameter) :" + sg.totalSudut(60));
        System.out.println("Total Sudut (2 parameter) :" + sg.totalSudut(60, 50));
        System.out.println("Keliling (3 sisi) :" + sg.keliling(3, 4, 5));
        System.out.println("Keliling (2 sisi) :" + sg.keliling(3, 4));
    }
}