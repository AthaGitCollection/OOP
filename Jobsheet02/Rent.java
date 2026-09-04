public class Rent {
    public String id;
    public String memberName;
    public String gameName;
    public double priceDay;
    public int rentPeriod;

    public void showData(){
        System.out.println("ID\t\t\t: " + id);
        System.out.println("Member name\t\t: " + memberName);
        System.out.println("Game Name\t\t: " + gameName);
        System.out.println("Pay Amount\t\t: " + calculateCost());


    }
    public double calculateCost(){
        double payAmount = rentPeriod * priceDay;
        return payAmount;
    }
}
