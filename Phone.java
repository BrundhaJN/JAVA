class Phone{

public ContactsDTO[] contacts;
private int index;


public Phone(int size){

contacts=new ContactsDTO[size];

}

public boolean creatContactsDetails(ContactsDTO contacts){

boolean contact=false;
System.out.println("inside  ContactsDTO method");
if(contacts!=null){
this.contacts[index++]=contacts;

contact=true;
}
else{
System.out.println("Contacts not created");

}

return contact;
}

public void getAllContactsDetails(){
for(int i=0;i<contacts.length;i++){

System.out.println(contacts[i]);
}
}

public boolean updateContacts(String name,String Aname){
boolean update=false;
System.out.println("inside  updateContacts method");
for(int i=0;i<contacts.length;i++){

if(contacts[i].getName().equals(Aname)){
contacts[i].setName(name);
 update=true;
}
else{
System.out.println("not updated");
}
}
return update;
}


public boolean deleteContacts(String name){
boolean delete=false;
System.out.println("inside deleteContacts method");
for(int i=0;i<contacts.length;i++){
if(contacts[i].getName().equals(name)){
contacts[i]=null;
delete =true;


}
else{
	
	System.out.println("not deleted");
}


}
return delete;

}
}



