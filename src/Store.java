import java.util.ArrayList;

public class Store {

  private ArrayList<Book> books = new ArrayList<Book>();
  private ArrayList<DVD> dvds = new ArrayList<DVD>();
  private ArrayList<Racket> rackets = new ArrayList<Racket>();
  

  
  public static void main(String[] args) {
    Store store = new Store();
    Book book1 = new Book(10.0, 0.5, "123456789", "Java for dummies", 100, "Fantasy");
    DVD dvd1  = new DVD(20.0, 0.5, "The Matrix", "Action", "2:30");
    Racket r1 = new Racket(30.0, 0.5, "Wilson", "Tennis");


    store.books.add(book1);
    store.dvds.add(dvd1);
    store.rackets.add(r1);

    System.out.println("Number of products: " + store.getNumberOfProducts());
    System.out.println("Total weight: " + store.getTotalWeight());
    System.out.println("Most expensive product: " + store.getMostExpensiveProductPrice());

  }


  // number of products in the store
  public int getNumberOfProducts() {
    return books.size() + dvds.size() + rackets.size();
  }

  // total weight for all products 
  public double getTotalWeight() {
    double totalWeight = 0;
    for (Book book : books) {
      totalWeight += book.getWeight();
    }
    for (DVD dvd : dvds) {
      totalWeight += dvd.getWeight();
    }
    for (Racket racket : rackets) {
      totalWeight += racket.getWeight();
    }
    return totalWeight;
  }


  //  the price of the most expensive product
  public double getMostExpensiveProductPrice() {
    double mostExpensive = 0;
    for (Book book : books) {
      if (book.getPrice() > mostExpensive) {
        mostExpensive = book.getPrice();
      }
    }
    for (DVD dvd : dvds) {
      if (dvd.getPrice() > mostExpensive) {
        mostExpensive = dvd.getPrice();
      }
    }
    for (Racket racket : rackets) {
      if (racket.getPrice() > mostExpensive) {
        mostExpensive = racket.getPrice();
      }
    }
    return mostExpensive;
  }

  //  number of books in fantasy category
  public int getNumberOfFantasyBooks() {
    int numberOfFantasyBooks = 0;
    for (Book book : books) {
      if (book.getCategory().equals("Fantasy")) {
        numberOfFantasyBooks++;
      }
    }
    return numberOfFantasyBooks;
  }

}
