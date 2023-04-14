public class Book {
  private String title, author;
  private int publishedYear, pageQuantity;
  private double price;
  
  public Book( String title, String author, double price, int publishedYear, double d) {
    this.title = title;
    this.author = author;
    this.price = price;
    this.publishedYear = publishedYear;
    this.pageQuantity = pageQuantity;
  }

  // Getters
  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public double getPrice() {
    return price;
  }

  public int getPublishedYear() {
    return publishedYear;
  }

  public int getPageQuantity() {
    return pageQuantity;
  }

  // Setters
  public void setTitle(String title) {
   this.title = title; 
  }
  public void setAuthor(String author) {
   this.author = author; 
  }
  public void setPrice(double price) {
   this.price = price; 
  }
  public void setPublishedYear(int publishedYear) {
   this.publishedYear = publishedYear; 
  }
  public void setPageQuantity(int pageQuantity) {
   this.pageQuantity = pageQuantity; 
  }

  // MÃ©todos especiais
  public double calcularPrecoPorPagina(){
    return price / pageQuantity;
  }

  public void imprimeDados(){
    System.out.println("-----Informações do Livro-----");
    System.out.println("Título do livro: "+title);
    System.out.println("Autor do livro: " +author);
    System.out.println("Preço do livro: " +price);
    System.out.println("Ano de publicação do livro: " +publishedYear);
    System.out.println("Quantidade de páginas do livro: " +pageQuantity);
  }
}
