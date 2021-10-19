class Men{
	


public String name;
public Beard beard;

public Men(){
	System.out.println("Men object is created");
}

public void setName(String name){

this.name=name;
}

public void setBeard(Beard beard){

this.beard=beard;
}

@Override
public String toString(){

return "Men-[name="+this.name+",beard="+beard+"]";
}

}