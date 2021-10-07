class BankTester{

public static void main(String a[]){

Bank bank=new BandanBank();
  bank.provideLoans(7.5);
System.out.println(bank);


Bank amont=new SbiBank();
amont.provideLoans(5);
System.out.println(amont);

Bank interst=new HdfcBank();
interst.provideLoans(7.9);
System.out.println(interst);


Bank cmp=new AxisBank();
cmp.provideLoans(9);
System.out.println(cmp);
}

}