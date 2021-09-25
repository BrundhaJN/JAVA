class ResturantTester{

public static void main(String a[]){

 Resturant rest=new  Resturant();
 
 
 rest.resturantId=123;
 rest.name="1947";
 rest.type="veg";
 rest.location="Malleshwaram";
 rest.ownerName="Sadananda Gowda";
 
 rest.serveFood();
 rest.displayResturantDetails();
 //System.out.println( rest.resturantId+" "+rest.name+" "+rest.type+" "+rest.location+" "+rest.ownerName);
 
 
 
 
  Resturant rest1=new  Resturant();
 
 
 rest1.resturantId=178;
 rest1.name="Grand";
 rest1.type=" Non-veg";
 rest1.location="RajajiNagar";
 rest1.ownerName="Sadananda ";
 
 rest1.serveFood();
 rest1.displayResturantDetails();
 
 //System.out.println( rest1.resturantId+" "+rest1.name+" "+rest1.type+" "+rest1.location+" "+rest1.ownerName);
 
 
  Resturant rest2=new  Resturant();
 
 
 rest2.resturantId=100;
 rest2.name="Navarang family Resturant";
 rest2.type="Veg and Non Veg";
 rest2.location="Malleshwaram";
 rest2.ownerName="Nimith";
 
 rest2.serveFood();
 rest2.displayResturantDetails();
 
 //System.out.println( rest2.resturantId+" "+rest2.name+" "+rest2.type+" "+rest2.location+" "+rest2.ownerName);
}

}