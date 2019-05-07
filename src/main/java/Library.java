import java.util.ArrayList;

public class Library {

    private String name;
    private int capacity;
    ArrayList<Book> libraryStock;

    public Library(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.libraryStock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addBook(Book book){
        this.libraryStock.add(book);
    }

    public int bookCount(){
        return this.libraryStock.size();
    }

    public int getCapacity() {
        return capacity;
    }

    //    public void stockFull() {
//        if()
//    }
}
