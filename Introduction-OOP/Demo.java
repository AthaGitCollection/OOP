public class Demo {
    public static void main(String[] args) {

        // Create objects
        Laptop laptop1 = new Laptop();
        Smartphone smartphone1 = new Smartphone();
        Television television1 = new Television();
        Fan fan1 = new Fan();

        // Laptop
        laptop1.setBrand("ASUS");
        laptop1.setRam(16);
        laptop1.printInfo();

        System.out.println();

        // Smartphone
        smartphone1.setBrand("Samsung");
        smartphone1.setStorage(256);
        smartphone1.printInfo();

        System.out.println();

        // Television
        television1.setBrand("LG");
        television1.setPower(100);
        television1.setScreenSize(43);
        television1.setResolution("4K UHD");
        television1.printInfo();

        System.out.println();

        // Fan
        fan1.setBrand("Miyako");
        fan1.setPower(45);
        fan1.setSpeedLevel(3);
        fan1.setHasTimer(true);
        fan1.printInfo();
    }
}