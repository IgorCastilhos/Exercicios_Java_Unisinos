public class Client {
  private String name, email, password;
  private int age;
  private char gender;

  public Client (String name, int age, char gender, String email, String password) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.email = email;
    this.password = password; 
  }

    // Getters
    public String getName() {
      return name;
    }
  
    public int getAge() {
      return age;
    }
  
    public char getGender() {
      return gender;
    }
  
    public String getEmail() {
      return email;
    }
  
    public String getPassword() {
      return password;
    }
  
    // Setters
    public void setName(String name) {
     this.name = name; 
    }
    public void setAge(int age) {
     this.age = age; 
    }
    public void setGender(char gender) {
     this.gender = gender; 
    }
    public void setEmail(String email) {
     this.email = email; 
    }
    public void setPassword(String password) {
     this.password = password; 
    }
  
    // MÃ©todos especiais
    public void imprimeInformacoes(){
      System.out.println("-----Informações do Cliente-----");
      System.out.println("Nome: "+name);
      System.out.println("Idade: " +age);
      System.out.println("Sexo: " +gender);
      System.out.println("Email: " +email);
      System.out.println("Senha: " +password + "\n");
    }
}
