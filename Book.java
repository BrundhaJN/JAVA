class Book{

private  static Book book=null;

public static Book getBook(){

return book;
}

static{

book =new Book();

}
}