public class Laptop {
    private String brand;
    private int ram;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void printInfo() {
        System.out.println("=== Laptop ===");
        System.out.println("Brand : " + brand);
        System.out.println("RAM   : " + ram + " GB");
    }
}