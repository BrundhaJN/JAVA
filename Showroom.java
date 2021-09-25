class Showroom{

  public String name;
  public String type;
  public String location;
  
public Showroom(String name,String type,String location){

     this.name=name;
	 this.type=type;
	 this.location=location;
	
}


public static void main(String a[]){


Showroom sh=new Showroom("Maruthi","car","tiptur");
System.out.println(sh.name+ " "+sh.type+" "+sh.location);


}


}