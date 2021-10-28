class Hospital{

public PatientDTO[] patients;
private  int index;

public Hospital(int size){

patients=new PatientDTO[size];
}

public boolean creatPatientDetails(PatientDTO patients){

boolean patientAdded=false;
System.out.println("inside creatPatientDetails method");
if(patients!=null){
this.patients[index++]=patients;

 patientAdded=true;
}
else{
System.out.println("No patient added");

}

return patientAdded;
}
public void getAllPatients(){
for(int i=0;i<patients.length;i++){

System.out.println(patients[i]);
}
}

public boolean updatePatientAgeById(int age,int id){
boolean patientageupdatedbyid=false;
System.out.println("inside updatePatientAgeById method");
for(int i=0;i<patients.length;i++){

if(patients[i].getId()==id){
patients[i].setAge(age);
 patientageupdatedbyid=true;
}
else{
System.out.println("not updated");
}
}
return patientageupdatedbyid;
}



public boolean deletePatientById(int id){
boolean delete=false;
System.out.println("inside deletePatientById method");
for(int i=0;i<patients.length;i++){
if(patients[i].getId()==id){
patients[i]=null;
delete =true;


}
else{
	
	System.out.println("not deleted");
}


}
return delete;
}

}

