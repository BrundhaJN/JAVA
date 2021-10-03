 public class GoldDTO{

public GoldDTO(){

System.out.println("GoldDTO object is created");
} 

private String name;
private String type;
private String percentageOfGold;

public String getName(){
  
  return name;
}
public void setName(String name){
this.name=name;

}

public String getType(){
return type;
}

public void setType(String type){
this.type=type;
}

public String getPercentageOfGold(){
return percentageOfGold;
}

public void setPercentageOfGold(String PercentageOfGold){

this.percentageOfGold=percentageOfGold;
}
}