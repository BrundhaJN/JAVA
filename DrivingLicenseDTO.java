public class DrivingLicenseDTO{
 
 
public DrivingLicenseDTO(){
 
System.out.println("DrivingLicenseDTO object is created");
 
}

private String name;
private int age;
private String address;

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

@Override
public String toString(){
	return "DrivingLicenseDTO-[name="+this.name+",age="+this.age+",address="+this.address+"]";
}

public int hashcode(){
	return age;
}
 
 }