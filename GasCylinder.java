class GasCylinder{

public String name;
public int cost;
public String color;
public String weight;


public GasCylinder(String name,int cost,String color,String weight){
	System.out.println("GasCylinder object is created");

       this.name=name;
       this.cost=cost;
	   
       this.color=color;
      this.weight=weight;

}

public static void main(String a[]){

 GasCylinder gas=new  GasCylinder("Indian",950,"red","14kg");
 
System.out.println(gas.name+" "+gas.cost+" "+gas.color+" "+gas.weight);

}


}