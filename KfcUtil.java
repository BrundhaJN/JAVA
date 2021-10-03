class KfcUtil{

public static void main(String a[]){

KfcDTO kfc=new KfcDTO();

kfc.setName("chicken");
kfc.setPrice(499);
kfc.setAddress("RajajiNagar");

System.out.println(kfc.getName()+ " "+kfc.getPrice()+ " "+kfc.getAddress());


}
}