import java.util.Scanner;

class HospitalTester{

public static void main(String a[]){
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();

Hospital hospital=new Hospital(size);
for(int i=0;i<size;i++){
PatientDTO dto=new PatientDTO();

System.out.println("enter the patient details");

System.out.println("enter the patient Id");
int id=sc.nextInt();

System.out.println("enter the patient name");
String name=sc.next();

System.out.println("enter the patient address");
String address=sc.next();

dto.setId(id);
dto.setName(name);
dto.setAddress(address);

boolean  patientAdde=hospital.creatPatientDetails(dto);
System.out.println("patient added:");

}

hospital.getAllPatients();
//System.out.println(hospital.getAllPatients());
System.out.println("enter the  updatePatientAgeById ");
System.out.println(hospital. updatePatientAgeById(sc.nextInt(),sc.nextInt()));

System.out.println("enter the deletePatientById");
System.out.println(hospital.deletePatientById(sc.nextInt()));

}
}