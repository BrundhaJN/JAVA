class AirportTester{

public static void main(String a[]){

Airport  airport=new Airport();

airport.setAirportId(789);
airport.setAirportName("KIA");
airport.setLocation("Bangalore");

Terminal terminal=new Terminal();
terminal.terminalId=99;
terminal.name="TERMINAL1";


//airport has Terminal
airport.setTerminals(terminal);//has --a relation

System.out.println(airport);
}

}