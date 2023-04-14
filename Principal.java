public class Principal{
  public static void main(String[] args){
      
      int idClient = 1;
      Client client1 = new Client(Teclado.leString("Informe o nome do Cliente "+idClient+":"),
                               Teclado.leInt("Informe a idade do Cliente "+idClient+":"),
                               Teclado.leChar("Informe o sexo do Cliente "+idClient+":"),
                               Teclado.leString("Informe o email do Cliente "+idClient+":"),
                               Teclado.leString("Informe a senha do Cliente "+idClient+":"));
      idClient += 1; //ou: idClient++;
      Client client2 = new Client(Teclado.leString("Informe o nome do Cliente "+idClient+":"),
                               Teclado.leInt("Informe a idade do Cliente "+idClient+":"),
                               Teclado.leChar("Informe o sexo do Cliente "+idClient+":"),
                               Teclado.leString("Informe o email do Cliente "+idClient+":"),
                               Teclado.leString("Informe a senha do Cliente "+idClient+":"));
      idClient += 1;
      Client client3 = new Client(Teclado.leString("Informe o nome do Cliente "+idClient+":"),
                               Teclado.leInt("Informe a idade do Cliente "+idClient+":"),
                               Teclado.leChar("Informe o sexo do Cliente "+idClient+":"),
                               Teclado.leString("Informe o email do Cliente "+idClient+":"),
                               Teclado.leString("Informe a senha do Cliente "+idClient+":"));
      
      int idBook = 1;
      Book book1 = new Book(Teclado.leString("Informe o t��tulo do Book "+idBook+":"),
                               Teclado.leString("Informe o autor do Book "+idBook+":"),
                               Teclado.leInt("Informe o ano de publica��o do Book "+idBook+":"),
                               Teclado.leInt("Informe a quantidade de p��ginas do Book "+idBook+":"),
                               Teclado.leDouble("Informe o pre�o do Book "+idBook+":"));
      idBook += 1;
      Book book2 = new Book(Teclado.leString("Informe o t��tulo do Book "+idBook+":"),
                               Teclado.leString("Informe o autor do livro "+idBook+":"),
                               Teclado.leInt("Informe o ano de publica��o do Book "+idBook+":"),
                               Teclado.leInt("Informe a quantidade de páginas do Book "+idBook+":"),
                               Teclado.leDouble("Informe o preço do Book "+idBook+":"));
      idBook += 1;
      Book book3 = new Book(Teclado.leString("Informe o título do Book "+idBook+":"),
                               Teclado.leString("Informe o autor do Book "+idBook+":"),
                               Teclado.leInt("Informe o ano de publicação do Book "+idBook+":"),
                               Teclado.leInt("Informe a quantidade de páginas do Book "+idBook+":"),
                               Teclado.leDouble("Informe o preço do Book "+idBook+":"));
      
      System.out.println("Preço por página do Book "+book1.getTitle()+": R$"+book1.calcularPrecoPorPagina());
      System.out.println("Preço por página do book "+book2.getTitle()+": R$"+book2.calcularPrecoPorPagina());
      System.out.println("Preço por página do book "+book3.getTitle()+": R$"+book3.calcularPrecoPorPagina());
      
      System.out.println("Informações dos objetos criados:");
      System.out.println("*** C ***");
      client1.imprimeInformacoes();
      client2.imprimeInformacoes();
      client3.imprimeInformacoes();
      System.out.println("*** BookS ***");
      book1.imprimeDados();
      book2.imprimeDados();
      book3.imprimeDados();
  }
}