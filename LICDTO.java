public class LICDTO{


public LICDTO(){

System.out.println("LICDTO object is created");

}

private int policyID;
private String name;
private int years;


public int getPolicyID(){
return policyID;

}

public  void setPolicyID(int policyID){

this.policyID=policyID;
}

public String  getName(){
return name;
}
public  void setName(String name){
this.name=name;
}

public  int getYears(){
return years;
}
public  void setYears(int years){
this.years=years;
}
}