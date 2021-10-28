import java.util.Scanner;
class HotelTester{

public static void main(String a[]){

Scanner sc=new Scanner(System.in);
int size=sc.nextInt();

Hotel hotel=new Hotel(size);

for(int i=0;i<size;i++){
FoodIteamsDTO dto=new FoodIteamsDTO();

System.out.println("enter the FoodIteams details");

System.out.println("enter the Iteams");
String iteams=sc.next();

System.out.println("enter the name");
String name=sc.next();

System.out.println("enter the cost");
int cost=sc.nextInt();

dto.setIteams(iteams);
dto.setName(name);
dto.setCost(cost);

boolean  creatFoodIteamsDetails=hotel.creatFoodIteamsDetails(dto);
System.out.println("FoodIteams added:");
}
hotel.getAllFoodIteams();

System.out.println("enter the  updateFoodIteamsByName");
System.out.println(hotel.updateFoodIteamsByName(sc.next(),sc.next()));

System.out.println("enter the deleteIteams");
System.out.println(hotel.deleteIteams(sc.next()));

}
}