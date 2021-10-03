class GoldTester{

public static void main(String a[]){

GoldDTO dto=new GoldDTO();

dto.setName("NeckChain");
dto.setType("AlmarGold");
dto.setPercentageOfGold("36%");

System.out.println(dto.getName()+" "+dto.getType()+" "+dto.getPercentageOfGold());
}
}