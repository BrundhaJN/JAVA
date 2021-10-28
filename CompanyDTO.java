public class CompanyDTO{

public CompanyDTO(){

System.out.println(" CompanyDTO object is created");

}

private String name;
private String ename;
private String address;

public String getName(){

return name;
}
public void setName(String name){

this.name=name;
}

public String getEname(){

return ename;
}
public void setEname(String ename){
this.ename=ename;

}

public String getAddress(){
return address;
}

public void setAddress(String address){
this.address=address;

}

@Override
public String toString(){

return "CompanyDTO--[name="+this.name+",ename="+this.ename+",address="+this.address+"]";

}

}