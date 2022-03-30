package Book;

public class FictionBook extends Book{
    String category ;

    public FictionBook(String bookCode, String name, double price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    public FictionBook() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
