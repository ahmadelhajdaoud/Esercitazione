public class Racket  extends Product{
  
  private String brand;
  private String type;



  public Racket(double price, double weight, String brand, String type) {
    super(price, weight);
    this.brand = brand;
    this.type = type;
  }

  public String getBrand() {
    return brand;
  }

  public String getType() {
    return type;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setType(String type) {
    this.type = type;
  }



}
