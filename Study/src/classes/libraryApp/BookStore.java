package classes.libraryApp;

public class BookStore {
    private Book[] books=new Book[100];
    private int noOfBooks;

//    public BookStore() {
//        noOfBooks=0;
//        books=new Book[100];
//    }
    public void addBook(Book book){
        books[noOfBooks]=book;
        noOfBooks++;
    }

    public void printBookDetails() {
        for (int i = 0; i < noOfBooks; i++) {
            if (books[i].getBook_Id() != -1) {
                System.out.println("-------------------");
                System.out.println("BookID:::::" + books[i].getBook_Id());
                System.out.println("Book Name:::::" + books[i].getBook_Title());
                System.out.println("Book Author Name::::" + books[i].getBook_AuthorName());
            }

        }
    }

    public void deleteBook(int book_id) {
        for(int i=0;i<noOfBooks;i++){
            if(books[i].getBook_Id()==book_id){
                books[i].setBook_Id(-1);
                break;
            }
        }

    }

    public void updateBook(int book_id) {
        for(int i=0;i<noOfBooks;i++){
            if(books[i].getBook_Id()==book_id){
                books[i].setBook_Title("Programming in C");
                books[i].setBook_AuthorName("Balaguruswamy");
                break;
            }


        }
    }
}

