import java.util.Scanner;

class MovieTester{

public static void main(String a[]){

Scanner sc=new Scanner(System.in);
int size=sc.nextInt();

Movie movie=new Movie(size);
for(int i=0;i<size;i++){
CastDTO dto=new  CastDTO();

System.out.println("enter the details");

System.out.println("enter the name");
String name=sc.next();

System.out.println("enter the aname");
String aname=sc.next();




dto.setAname(aname);
dto.setName(name);


boolean catsadded=movie.creatcastDetails(dto);
System.out.println("cats added:");

}

movie.getAllMovieDetails();

System.out.println("enter the updateCasts ");
System.out.println(movie.updateCasts(sc.next(),sc.next()));

System.out.println("enter the  deleteCast");
System.out.println(movie.deleteCast(sc.next()));



}

}




