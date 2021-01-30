package classes.libraryApp;

public class LibraryManagement {
    public static void main(String ar[]){
        BookStore bookStore=new BookStore();
        Book book=new Book(1,"JAVA","John");

        bookStore.addBook(book);
        bookStore.addBook(new Book(2,"c++","Ann"));
        bookStore.addBook(new Book(3,"c","Martin"));
        bookStore.addBook(new Book(4,"Data Structure","Dounglas"));
        bookStore.addBook(new Book(5,"Networking","Harshi"));
        bookStore.printBookDetails();
        System.out.println("***************************************************");
//
//
//        System.out.println("After Deletion");
//        bookStore.deleteBook(3);
//        bookStore.printBookDetails();


        System.out.println("AFTER UPDATION");
        bookStore .updateBook(1);
        bookStore.printBookDetails();




    }
}
