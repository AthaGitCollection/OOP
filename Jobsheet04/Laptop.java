public class Laptop {
    private String merk;
    private Processor proc;

    public Laptop() {
    }
    public Laptop(String merk, Processor proc) {
        this.merk = merk;
        this.proc = proc;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getMerk() {
        return merk;
    }
    public void setProc(Processor proc) {
        this.proc = proc;
    }
    public Processor getProc() {
        return proc;
    }
    public void info() {
        System.out.println("Nerk Laptop = " + merk);
        proc.info();
        
            }
    public void setRam(int i) {
        throw new UnsupportedOperationException("Unimplemented method 'setRam'");
    }
    public void printInfo() {
        throw new UnsupportedOperationException("Unimplemented method 'printInfo'");
    }
    public void setBrand(String string) {
        throw new UnsupportedOperationException("Unimplemented method 'setBrand'");
    }
        }

