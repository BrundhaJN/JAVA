class Gun{

public Gun(){

System.out.println("constructor is called ");
System.out.println(this.getClass().getSimpleName()+ " Gun object is created ");

  {
        System.out.println("init block is executed");
   }
  

}


 static{

System.out.println("static block is executed");
}



}