class Hotel{

public FoodIteamsDTO[] food;
private int index;

public Hotel(int size){

food=new FoodIteamsDTO[size];

}
public boolean creatFoodIteamsDetails(FoodIteamsDTO food){

boolean foodIteam=false;
System.out.println("inside creatFoodIteamsDetails method");
if(food!=null){
this.food[index++]=food;

foodIteam=true;
}
else{
System.out.println("foodIteam not created");

}

return foodIteam;
}

public void getAllFoodIteams(){
for(int i=0;i<food.length;i++){

System.out.println(food[i]);
}
}


public boolean updateFoodIteamsByName(String iteams,String name){
boolean update=false;
System.out.println("inside updateFoodIteamsByName method");
for(int i=0;i<food.length;i++){

if(food[i].getIteams().equlas(iteams)){
food[i].setName(name);
 update=true;
}
else{
System.out.println("not updated");
}
}
return update;
}

public boolean deleteIteams(String name){
boolean delete=false;
System.out.println("inside deleteIteams method");
for(int i=0;i<food.length;i++){
if(food[i].getName()==name){
food[i]=null;
delete =true;


}
else{
	
	System.out.println("not deleted");
}


}
return delete;

}
}



