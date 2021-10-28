public class PatientDTO{

public PatientDTO(){

System.out.println("PatientDTO object is created");

}

private int id;
private String name;
private String address;
private int age;

public int getAge(){
	return age;
}
public void setAge(int age){
	
	this.age=age;
}

public int getId(){

return id;
}
public void setId(int id){

this.id=id;
}
public String getName(){

return name;
}
public void setName(String name){

this.name=name;
}
public String getAddress(){

return address;
}
public void setAddress(String address){
this.address=address;
}
@Override
public String toString(){
	return "PatientDTO---[id="+this.id+",name="+this.name+",age="+this.age+",address="+this.address+"]";
}

}