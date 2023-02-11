
public class Book extends Product{
  
  private String ISBN;
  private String title;
  private String Category;
  private int pages;



  public Book(double price, double weight, String ISBN, String title, int pages, String Category) {
    super(price, weight);
    this.ISBN = ISBN;
    this.title = title;
    this.pages = pages;
    this.Category = Category;
  }


  public String getISBN() {
    return ISBN;
  }

  public String getTitle() {
    return title;
  }


  public int getPages() {
    return pages;
  }

  public String getCategory() {
    return Category;
  }

  public void setISBN(String iSBN) {
    ISBN = iSBN;
  }

  public void setTitle(String iTitle) {
    title = iTitle;

  }

  public void setPages(int iPages) {
    pages = iPages;
  }

  public void setCategory(String iCategory) {
    Category = iCategory;
  }
  
}
