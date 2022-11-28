import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);  // Reading from System.in
    
    System.out.println("Capitalized letters? true / false");
    boolean capitalFlag = reader.nextBoolean();
    System.out.println("Numbers? true / false");
    boolean numberFlag = reader.nextBoolean();
    System.out.println("Symbols? true / false");
    boolean symbolsFlag = reader.nextBoolean();
    System.out.println("Password length?");
    int passLength = reader.nextInt();
    
    reader.close();
    
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    
    if (capitalFlag){
      alphabet += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    }
    if (numberFlag){
      alphabet += "1234567890";
    }
    if (symbolsFlag){
      alphabet+="!@#$%^&*()_+{}|:<>?";
    }
    String password = "";
    
    for (int i=0; i<passLength; i++){
      Random rand = new Random();
      password += alphabet.charAt(rand.nextInt(alphabet.length() + 1)); //Add a random character from the alphabet
    }
    System.out.println("Password: "+password);
  }
}
