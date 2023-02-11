public class DVD  extends Product{
  
  private String title;
  private String category;
  private String duration;

  public DVD(double price, double weight, String title, String category, String duration) {
    super(price, weight);
    this.title = title;
    this.category = category;
    this.duration = duration;
  }

  public String getTitle() {
    return title;
  }

  public String getCategory() {
    return category;
  }

  public String getDuration() {
    return duration;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

}