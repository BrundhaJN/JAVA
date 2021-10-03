public class KfcDTO{

public KfcDTO(){

System.out.println("KfcDTO object is created");
}

private String name;
private int price;
private String address;

public String getName(){

return name;
}

public void setName(String name){

this.name=name;
}

public int getPrice(){

return price;
}

public void setPrice(int price){

this.price=price;
}

public String getAddress(){

return address;
}
public void setAddress(String address){
this.address=address;

}
}