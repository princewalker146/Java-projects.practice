public class Book{
    String author;
    String title;
    int pages;
    void displayInfo(){
        System.out.println("The book book is written by the author "+author+"Titled"+title+"in "+pages);
    }
    public static void main(String[] args){
        Book mySheet= new Book();
        mySheet.author="Ednid Blython";
        mySheet.title= "Force Hard";
        mySheet.pages= 56;
        mySheet.displayInfo();
    }
}