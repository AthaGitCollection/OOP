package OOP.Jobsheet07.Experiment1;

public class Utama { 
public static void main(String[] args)
{
System.out.println("Program Testing Class Manager & Staff");
Manager man[]=new Manager [2];
Staff staffl[]=new Staff[2];
Staff staff2[]=new Staff[3];

man[0]=new Manager();
man[0].setNama ("Tedjo");
man[0].setNip("101");
man[0].setGolongan ("1");
man[0].setTunjangan (5000000);
man[0].setBagian ("Administrasi");
man[1]=new Manager();
man[1].setNama ("Atika");
man[1].setNip("102");
man[1].setGolongan ("1");
man[1].setTunjangan (2500000);
man[1].setBagian("Pemasaran");

staffl[0]=new Staff();
staffl[0].setNama ("Usman");
staffl[0].setNip ("0003");
staffl[0].setGolongan ("2");
staffl[0].setLembur(10);
staffl[0].setgajiLembur (10000);

staffl[1]=new Staff();
staffl[1].setNama ("Anugrah");
staffl[1].setNip("0005");
staffl[1].setGolongan ("2");
staffl[1].setLembur (10);
staffl[1].setgajiLembur (55000);
man[0].setStaff(staffl);

staff2[0]=new Staff();
staff2[0].setNama ("Hendra");
staff2[0].setNip ("0004");
staff2[0].setGolongan("3");
staff2[0].setLembur (15);
staff2[0].setgajiLembur (5500);

staff2[1]=new Staff();
staff2[1].setNama ("Arie");
staff2[1].setNip("0006");
staff2[1].setGolongan ("4");
staff2[1].setLembur (5);
staff2[1].setgajiLembur (100000);
man[0].setStaff(staffl);

staff2[2]=new Staff();
staff2[2].setNama ("Mentari");
staff2[2].setNip("0007");
staff2[2].setGolongan ("3");
staff2[2].setLembur (6);
staff2[2].setgajiLembur (20000);
man[1].setStaff(staff2);

man[0].lihatInfo();
man[1].lihatInfo();

}

}