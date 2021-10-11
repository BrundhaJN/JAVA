class Fan{


public Fan(){

System.out.println("Constructor is called");
System.out.println(this.getClass().getSimpleName()+"object is created");

}

{

System.out.println("init block is excuted");
}

static{
  System.out.println("static block is excuted");
 
}

}