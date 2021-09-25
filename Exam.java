class Exam{


public String universityName;
public int fees;


public Exam(String name,int f){

System.out.println("Exam object is created");

    universityName=name;
    fees=f;

}


public static void main(String a[]){

  Exam exam=new Exam("VTU",1350);
  
  System.out.println(exam.universityName+" "+exam.fees);
}


}