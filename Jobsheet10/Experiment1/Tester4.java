package OOP.Jobsheet10.Experiment1;

public class Tester4 {
    public static void main(String[] args) {
        Owner ow = new Owner();
        ElectricityBill eBill = new ElectricityBill(5, "R-1");
        ow.Pay(eBill);                       
        System.out.println("------------------------------");

        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        ow.Pay(pEmp);                        
        System.out.println("------------------------------");

        IntershipEmployee iEmp = new IntershipEmployee("Sunarto", 5);
        ow.showMyEmployee(pEmp);             
        System.out.println("------------------------------");
        ow.showMyEmployee(iEmp);            

        //ow.Pay(iEmp);
                         
    }
}
