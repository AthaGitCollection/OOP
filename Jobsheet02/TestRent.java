public class TestRent {
    public static void main(String args[]) {
        Rent rnt1 = new Rent();

        rnt1.id = "R001";
        rnt1.memberName = "Atha";
        rnt1.gameName = "Ghost of Tsuhima";
        rnt1.priceDay = 10000;
        rnt1.rentPeriod = 3;
        rnt1.showData();
    }
}
