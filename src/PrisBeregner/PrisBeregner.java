package PrisBeregner;

import java.util.Scanner;

public class PrisBeregner {
  //Her kan man som bruger indtaste infromationer
  public static void main(String[] args) {
    Scanner scanner1 = new Scanner(System.in);
    System.out.print("Hvad er prisen uden moms?: "); // spørger spørgsmålet til bruger
    double udenMoms = scanner1.nextDouble(); //giver mulighed for at skrive
    final double MOMS = 0.25; // Final betyder det er en konstant. Jeg skriver MOMS med stort da det er en konstant.
    System.out.print("Prisen med moms er: ");
    printer(udenMoms, MOMS); //referer til print metoden
  }

  private static double momsBeregner(double udenMoms, double MOMS) { //Denne metode beregner
    return ((udenMoms * MOMS) + udenMoms);
  }

  public static void printer(double udenMoms, double MOMS) { //Denne metoder printer
    System.out.printf("%.2f", momsBeregner(udenMoms, MOMS)); //Her bruger vi beregner metoden til at printe.
  }


}




