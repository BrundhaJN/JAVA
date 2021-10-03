class LICUtil{

public static void main(String a[]){

LICDTO lic=new LICDTO();

lic.setPolicyID(12345);
lic.setName("Ravi");
lic.setYears(12);

System.out.println(lic.getPolicyID()+" "+lic.getName()+" "+lic.getYears());

}


}