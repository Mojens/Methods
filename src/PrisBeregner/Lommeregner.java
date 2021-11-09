package PrisBeregner;

//import java.util.Scanner; //bruger vi ikke lige pt
import java.util.Random;
public class Lommeregner {
  public static void main(String[] args) {
    // rand.nextInt(tal) dette tal fortæller hvad grænsen er fra 0. samme gælder rand.nextDouble(tal)
    /*Scanner scanner = new Scanner(System.in);*/ //fjerner scanner da den står som random lige nu
    Random rand = new Random(); //Ligesom med scanner så er rand navnet på vores random objekt
    System.out.print("Tast første nummer: ");
    int tal1=rand.nextInt(100); // skal ændres til scanner.nextDouble() hvis brugereen skal taste
    System.out.print("Tast andet nummer: ");
    int tal2=rand.nextInt(20); // skal ændres til scanner.nextDouble() hvis brugeren skal taste
    System.out.printf("%.2f",sum(tal1,tal2));
  }
  private static double sum(double tal1, double tal2){
    return tal1+tal2; //Her bestemmer vi om de skal + med hinanden eller -. Hvis vi vælger - kan den gå under 0.
  }
}
