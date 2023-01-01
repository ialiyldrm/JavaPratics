import java.util.Date;

public class Book {
    private String name;
    private int pageCount;
    private String author;
    private Date publicationDate;
  
    public Book(String name, int pageCount, String author, Date publicationDate) {
      this.name = name;
      this.pageCount = pageCount;
      this.author = author;
      this.publicationDate = publicationDate;
    }
  
    public Book() {
    }

    public String getName() {
      return name;
    }
  
    public void setName(String name) {
      this.name = name;
    }
  
    public int getPageCount() {
      return pageCount;
    }
  
    public void setPageCount(int pageCount) {
      this.pageCount = pageCount;
    }
  
    public String getAuthor() {
      return author;
    }
  
    public void setAuthor(String author) {
      this.author = author;
    }
  
    public Date getPublicationDate() {
      return publicationDate;
    }
  
    public void setPublicationDate(Date publicationDate) {
      this.publicationDate = publicationDate;
    }
  }
  