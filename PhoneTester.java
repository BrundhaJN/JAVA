import java.util.Scanner;

class PhoneTester{

public static void main(String a[]){

Scanner sc=new Scanner(System.in);
int size=sc.nextInt();

Phone phone=new Phone(size);
for(int i=0;i<size;i++){
ContactsDTO dto=new  ContactsDTO();

System.out.println("enter the Contact details");

System.out.println("enter the name");
String name=sc.next();

System.out.println("enter the aname");
String aname=sc.next();

System.out.println("enter the contact number");
int contactno=sc.nextInt();


dto.setAname(aname);
dto.setName(name);
dto.setContactNo(contactno);

boolean contactsadded=phone.creatContactsDetails(dto);
System.out.println("contacts added:");

}

phone.getAllContactsDetails();

System.out.println("enter the updateContacts ");
System.out.println(phone.updateContacts(sc.next(),sc.next()));

System.out.println("enter the  deleteContacts");
System.out.println(phone.deleteContacts(sc.next()));



}

}




