class Planets{

public String name;
public String shape;
public int noOfMoons;

public Planets(String nm,String sh,int no){
System.out.println("Planets Object is created");
name=nm;
shape=sh;
noOfMoons=no;
}

public void toRotate(){
System.out.println("Planets revovle around the sun");
}

public void displayDetails(){
System.out.println(name+" "+shape+" "+noOfMoons);

}
}