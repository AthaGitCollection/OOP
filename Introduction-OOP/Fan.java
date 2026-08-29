public class Fan extends Electronic {
    private int speedLevel;
    private boolean hasTimer;

    public void setSpeedLevel(int speedLevel) {
        this.speedLevel = speedLevel;
    }

    public void setHasTimer(boolean hasTimer) {
        this.hasTimer = hasTimer;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Speed Level : " + speedLevel);
        System.out.println("Timer       : " + (hasTimer ? "Available" : "Not Available"));
        System.out.println("Type        : Fan");
    }
}