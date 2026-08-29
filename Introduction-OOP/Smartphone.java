public class Smartphone {
    private String brand;
    private int storage;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void printInfo() {
        System.out.println("=== Smartphone ===");
        System.out.println("Brand   : " + brand);
        System.out.println("Storage : " + storage + " GB");
    }
}