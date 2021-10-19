class HumanTester{

public static void main(String a[]){

Human human=new Human();
human.setName("xyz");
human.setAge(34);
//System.out.println(human);

Heart heart=new Heart();
heart.normalBloodPresure=120;
human.setHeart(heart);
System.out.println(heart);

}

}