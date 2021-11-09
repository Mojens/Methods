package NameFun;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.print("Hvad er dit fornavn?: ");
    String firstName = scanner.nextLine(); //her indtaster brugeren
    System.out.print("Hvad er dit efternavn?: ");
    String lastName = scanner.nextLine(); //her indtaster brugeren
    System.out.println("dit navn er: "+fullName(firstName,lastName)); //Her printer jeg metoden ud som er skrevet
    //for neden.
  }

  public static String fullName(String firstName, String lastName){

    return firstName +" "+ lastName; //Her fortæller jeg så at returnen, at der skal være mellemrum.
    //hvis det var int eller double så kunne jeg lave et regnestykke der istedet.
  }
}

