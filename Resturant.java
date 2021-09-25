class Resturant{


   public int resturantId;
   public String name;
   public String type;
   public String location;
   public String ownerName;
   
 
 public  Resturant(){
 
 
 System.out.println(" Resturant object is created");
  }
  
public void serveFood(){

System.out.println("sserving a food");
}  


public void displayResturantDetails(){
	
	System.out.println(resturantId+" "+name+" "+type+" "+location+" "+ownerName);
	
}
  
}