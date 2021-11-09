package ValueMethods;

import java.util.Scanner;

public class Excersize2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("indtast et heltal n: ");
    int n = input.nextInt();
    System.out.print("Indtast et heltal m: ");
    int m = input.nextInt();
    System.out.println(isDivisible(n, m));
  }

  public static boolean isDivisible(int n, int m) { //Dette er opgaven
    if (n % m == 0) { // Her siger jeg n modulus til m skal give 0 da så går det op i hinanden
      return true; //Her skal den sige true hvis det er rigtigt
    }else{ //Ellers
      return false; // Skal den sige false tilbage
    }
  }
}

