public class Electronic {
    private String brand;
    private int power;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void printInfo() {
        System.out.println("=== Electronic ===");
        System.out.println("Brand : " + brand);
        System.out.println("Power : " + power + " Watt");
    }
}