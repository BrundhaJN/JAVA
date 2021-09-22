class  LaptopTester{

public static void main(String a[]){

  Laptop lap=new Laptop();
  
  lap.name="HP";
  lap.cost=41475;
  lap.processor="core i5";
  lap.memory=8;
  lap.harddisk=256;
  lap.operatingSystem="Windows";
  
  
  System.out.println(lap.name+" "+lap.cost+" "+lap.processor+" "+lap.memory+" "+ lap.harddisk+" "+lap.operatingSystem);
  lap.work();



  Laptop lap1=new Laptop();
  
  lap1.name="DELL";
  lap1.cost=41470;
  lap1.processor="core i7";
  lap1.memory=8;
  lap1.harddisk=256;
  lap1.operatingSystem="Windows10";
  
  
  System.out.println(lap1.name+" "+lap1.cost+" "+lap1.processor+" "+lap1.memory+" "+ lap1.harddisk+" "+lap1.operatingSystem);
  lap1.work();




  Laptop lap2=new Laptop();
  
  lap2.name="ASUS";
  lap2.cost=50000;
  lap2.processor="core i7";
  lap2.memory=8;
  lap2.harddisk=256;
  lap2.operatingSystem="Windows10";
  
  
  System.out.println(lap2.name+" "+lap2.cost+" "+lap2.processor+" "+lap2.memory+" "+ lap2.harddisk+" "+lap2.operatingSystem);
  lap2.work();

}

}