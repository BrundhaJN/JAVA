public class CurrencyDTO{

public CurrencyDTO(){
System.out.println("CurrencyDto object is created");
}

private String nameOfCurrency;
private String safestCurrencyInTheWorld;

public String getNameOfCurrency(){
return nameOfCurrency;
}
public void setNameOfCurrency(String nameOfCurrency){
this.nameOfCurrency=nameOfCurrency;
}
public String getSafestCurrencyInTheWorld(){
return safestCurrencyInTheWorld;
}
public void setSafestCurrencyInTheWorld(String safestCurrencyInTheWorld){
this.safestCurrencyInTheWorld=safestCurrencyInTheWorld;
}
public String toString(){

return "CurrencyDTO-[nameOfCurrency="+this.nameOfCurrency+",safestCurrencyInTheWorld="+this.safestCurrencyInTheWorld+"]";
}

}



