class DrivingLicenseUtil{

public static void main(String a[]){

DrivingLicenseDTO driv=new DrivingLicenseDTO();

driv.setName("Rashmi");
driv.setAge(18);
driv.setAddress("RajajiNagar");

System.out.println(driv);
System.out.println(driv.hashcode());

}
}