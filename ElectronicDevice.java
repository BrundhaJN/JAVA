class ElectronicDevice{

private static ElectronicDevice electronicDevice=null;

public static ElectronicDevice getElectronicDevice(){

return electronicDevice;
}


static{

electronicDevice=new ElectronicDevice();

}
}