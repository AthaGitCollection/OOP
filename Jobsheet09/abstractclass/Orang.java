package OOP.Jobsheet09.abstractclass;

public class Orang {
    private String nama;
    private Hewan hewanpeliharaan;

    public Orang(String nama ) {
        this.nama = nama;
    }
        public void peliharaanHewan(Hewan hewan) {
            this.hewanpeliharaan = hewan;
        }
        public void ajakPeliharaanJalanJalan () {
            System.out.println("Namaku : " + this.nama);
            System.out.println("Hewan peliharananku berjalan dengan cara : ");
            this.hewanpeliharaan.bergerak();
            System.out.println("-------------------------------------");
        }
    }
    

