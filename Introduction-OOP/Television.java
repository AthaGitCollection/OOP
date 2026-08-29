public class Television extends Electronic {
    private int screenSize;
    private String resolution;

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Screen Size : " + screenSize + " inch");
        System.out.println("Resolution  : " + resolution);
        System.out.println("Type        : Television");
    }
}