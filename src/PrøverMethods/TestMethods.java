package PrøverMethods;

import java.util.Scanner;

public class TestMethods {
  public static void main(String[] args) { //Main method laver jeg scanner
    Scanner scanner = new Scanner(System.in);
    System.out.print("Indtast dit navn her: ");
    String navn = scanner.nextLine();
    System.out.print("Indtast dit postnummer her: ");
    int postNummer = scanner.nextInt();
    System.out.print("dit navn og postnummer er: ");
    printer(navn,postNummer); //Henviser til printer metoden
  }

  public static void printer(String navn, int postNummer) { //Her laver jeg en metode de printer
    System.out.println(navnNummer(navn,postNummer));

  }
  public static String navnNummer(String navn, int postNummer){ //når der er string og tal involverede så skal der stå string ved public state da hvis der stod int så kan der ikke være tal involverede men omvendt kan der godt være tal i string.
    return navn +" " + postNummer; //Denne metode gør at string og int bliver + sammen.
  }
}

