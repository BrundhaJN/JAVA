class PatientUtil{


public static void main(String a[]){

PatientDTO dto=new PatientDTO();

dto.setPatientId(123457l);
dto.setName("xyz");
dto.setAge(67);
dto.setAddress("Rajajinagar");
dto.setBloodgroup("O+");
dto.setGender("Female");

System.out.println(dto.getPatientId()+" "+dto.getName()+" "+dto.getAge()+" "+dto.getAddress()+" "+dto.getGender()+" "+dto.getBloodgroup());

}

}