public class Book implements Comparable<Book> {
    private String name;
    private String author;
    private String date;
    private int pageNumber;

    public Book(String name,String author,int pageNumber,String date){
        this.name=name;
        this.author=author;
        this.date=date;
        this.pageNumber=pageNumber;   
    }
    
    @Override
    public int compareTo(Book o) {  
        return getName().compareTo(o.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    

   

    
    
}
