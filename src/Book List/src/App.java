import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        List<Book> books = new ArrayList<>();

    // 10 tane book nesnesi üretiyoruz
        for (int i = 0; i < 10; i++) {
            books.add(new Book(/* kitap ismi, sayfa sayısı, yazarın ismi, yayın tarihi */));
        }

    // stream yapısını ve lambda ifadelerini kullanarak kitap isminin karşısında yazar ismi olacak şekilde
    // yeni bir Map<String, String> oluşturuyoruz
        Map<String, String> bookAuthors = books.stream()
                                               .collect(Collectors
                                               .toMap(Book::getName, Book::getAuthor));
    
        // sayfa sayısı 100'den fazla olan kitapları filtreliyoruz ve yeni bir liste oluşturuyoruz
        List<Book> booksWithMoreThan100Pages = books.stream()
                                                    .filter(b -> b.getPageCount() > 100)
                                                    .collect(Collectors.toList());
    }                                         
    
    
}
