
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //sort by page of number
        TreeSet<Book> books=new TreeSet<>(new Comparator<Book>() {

            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber()-o2.getPageNumber();
            }
            
        });

        books.add(new Book("Mülksüzler", "Ursula L. Guin", 344, "1974"));
        books.add(new Book("Ben Robot", "Isaac Asimov", 248 , "1950"));
        books.add(new Book("Yürüme", "Oruç Aruoba", 224, "1992"));
        books.add(new Book("Yüzüklerin Efendisi", "J.R.R Tolkien", 1026, "1954"));
        books.add(new Book("Yeryüzü Aşkın Yüzü Oluncaya Dek", "Adnan Yücel", 78, "1995"));
        
        for (Book book : books) {
            System.out.println(book.getName()+"\t(Sayfa Sayısı:"+book.getPageNumber()+")");           
        }

        TreeSet<Book> books1=new TreeSet<>();
        books1.add(new Book("Mülksüzler", "Ursula L. Guin", 344, "1974"));
        books1.add(new Book("Ben Robot", "Isaac Asimov", 248 , "1950"));
        books1.add(new Book("Yürüme", "Oruç Aruoba", 224, "1992"));
        books1.add(new Book("Yüzüklerin Efendisi", "J.R.R Tolkien", 1026, "1954"));
        books1.add(new Book("Yeryüzü Aşkın Yüzü Oluncaya Dek", "Adnan Yücel", 78, "1995"));
        
        //sort by name
        System.out.println("------------------------------");
        for (Book book : books1) {
            book.compareTo(book);
            System.out.println(book.getName()+"\t(Sayfa Sayısı:"+book.getPageNumber()+")");           
        }

    }
}
