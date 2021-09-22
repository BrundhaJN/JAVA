class ApplicationTester{

public static void main(String a[]){

Application application=new  Application();

application.name="Instagram";
application.ratings=4;
application.purpose="Social Media";

System.out.println(application.name+" "+application.ratings+" "+application.purpose);
application.task();

Application application1=new  Application();

application1.name="Pubg";
application1.ratings=4;
application1.purpose="game";

System.out.println(application1.name+" "+application1.ratings+" "+application1.purpose);
application.task();

Application application2=new  Application();

application2.name="JioSavvn";
application2.ratings=4;
application2.purpose="Music";

System.out.println(application2.name+" "+application2.ratings+" "+application2.purpose);
application.task();


}

}