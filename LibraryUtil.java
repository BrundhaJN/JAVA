class LibraryUtil{

public static void main(String a[]){

LibraryDTO lib=new LibraryDTO();

lib.setName("KIT");
lib.setType("Story book");
lib.setLocation("Tiptur");

System.out.println(lib.getName()+" "+lib.getType()+" "+lib.getLocation());


}

}