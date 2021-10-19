class Folder{
	
public Folder(){
	
	System.out.println("Floder object is created");
}

public int size;
public Files files;

public void setSize(int size){

this.size=size;
}
public void setFiles(Files files){
	
	this.files=files;
}
@Override 
public String toString(){

return "Folder-[size="+this.size+",files="+this.files+"]";
}

}