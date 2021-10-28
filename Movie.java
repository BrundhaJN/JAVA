class Movie{

public CastDTO[] cast;
private int index;

public Movie(int size){

cast=new CastDTO[size];

}


public boolean creatcastDetails(CastDTO cast){

boolean cast1=false;
System.out.println("inside CastDTO method");
if(cast!=null){
this.cast[index++]=cast;

cast1=true;
}
else{
System.out.println("Casts not created");

}

return cast1;
}

public void getAllMovieDetails(){
for(int i=0;i<cast.length;i++){

System.out.println(cast[i]);
}
}

public boolean updateCasts(String name,String Aname){
boolean update=false;
System.out.println("inside updateCasts method");
for(int i=0;i<cast.length;i++){

if(cast[i].getName().equals(Aname)){
cast[i].setName(name);
 update=true;
}
else{
System.out.println("not updated");
}
}
return update;
}
public boolean deleteCast(String name){
boolean delete=false;
System.out.println("inside  deleteCast method");
for(int i=0;i<cast.length;i++){
if(cast[i].getName().equals(name)){
cast[i]=null;
delete =true;


}
else{
	
	System.out.println("not deleted");
}


}
return delete;

}
}


