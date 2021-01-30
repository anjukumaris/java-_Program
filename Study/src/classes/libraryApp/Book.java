package classes.libraryApp;

public class Book {
    private int book_Id;
    private String book_Title;
    private String book_AuthorName;

    public Book() {
    }

    public Book(int book_Id, String book_Title, String book_AuthorName) {
        this.book_Id = book_Id;
        this.book_Title = book_Title;
        this.book_AuthorName = book_AuthorName;
    }

    public int getBook_Id() {
        return book_Id;
    }

    public String getBook_Title() {
        return book_Title;
    }

    public String getBook_AuthorName() {
        return book_AuthorName;
    }

    public void setBook_Id(int book_Id) {
        this.book_Id = book_Id;
    }

    public void setBook_Title(String book_Title) {
        this.book_Title = book_Title;
    }

    public void setBook_AuthorName(String book_AuthorName) {
        this.book_AuthorName = book_AuthorName;
    }
}

