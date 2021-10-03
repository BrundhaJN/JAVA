 public class PatientDTO{

public PatientDTO(){

System.out.println("PatientDTO object is created");

}


private long patientId;
private String name;
private int age;
private String gender;
private String address;
private String bloodgroup;


public long getPatientId(){

return  patientId;
}

public void setPatientId(long patientId){

this.patientId=patientId;
}
public String getName(){

return name;
}
public void setName(String name){

this.name=name;
}
public int getAge(){
return age;
}
public void setAge(int age){

this.age=age;
}
public String getAddress(){
return address;
}
public void setAddress(String address){
this.address=address;
}
public String getGender(){
return gender;
}
public void setGender(String gender){
this.gender=gender;
}
public String getBloodgroup(){
return bloodgroup;
}
public void setBloodgroup(String bloodgroup){

this.bloodgroup=bloodgroup;
}


}