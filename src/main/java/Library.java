import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;

    public Library(){
        this.stock = new ArrayList<>();
    }


    public int stockCount() {
        return this.stock.size();
    }
}
