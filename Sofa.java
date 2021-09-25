class Sofa{

 public String name;
 public int cost;
 public String color;
 
 
 public Sofa(String name,int cost ,String color){
 
 System.out.println("Sofa object is craeted");
 this.name=name;
 this.cost=cost;
 this.color=color;
 
 }
 
 public static void main(String a[]){
 
 Sofa sofa=new Sofa("Quirk", 12600,"black");
 System.out.println(sofa.name+" "+sofa.cost+" "+sofa.color);
 
 
 }


}