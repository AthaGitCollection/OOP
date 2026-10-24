package OOP.Jobsheet09.abstractclass;

public class Program {
    public static void main(String[] args) {
        Kucing KucingKampung = new Kucing();
        Ikan LumbaLumba = new Ikan();
      

        Orang ani = new Orang ("Ani");
        Orang budi = new Orang ("Budi");

        ani.peliharaanHewan(KucingKampung);
        budi.peliharaanHewan(LumbaLumba);

        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();


    }
    
}
