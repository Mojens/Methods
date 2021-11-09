package DateCheck;

import java.util.Scanner;

public class DateCheck {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("are you an socialdemokratisk Minister?: ");
    while (!scanner.hasNextBoolean()) {//Laver denne while, hvis man nu skriver andet en yes or no så vil den blive ved med at spørger
      System.out.print("it has to be yes or no! try again: ");
      scanner.nextLine();

      boolean isMinister = areYouMinister(scanner.nextLine()); //Her kan brugeren indtaste yes eller no
      // da jeg laver scanner inde i metoden, hvor i metoden så er det inde i parentesen en string.

      System.out.print("Please Write your age: ");
      int userAge = scanner.nextInt();

      System.out.print("Please enter your dates age: ");
      int dateAge = scanner.nextInt();


      int minAge = calculateMinimumAge(userAge, isMinister);//Her siger jeg bare minimum age bliver udregnet i metoden calculateminimumAGE
      int maxAge = calculateMaximumAge(userAge);//Her siger jeg det samme bare med maximumAge

      boolean tooYoung = tooYoung(dateAge, minAge);//Her er det samme.
      boolean tooOld = tooOld(dateAge, maxAge);//Her er det samme.

      if (!tooYoung && !tooOld) { //Hvis date er hverken tooyoung eller tooold så er de perfekte
        System.out.println("you are perfect for eachother");
      }
      if (tooOld) { //Hvis den siger true på tooOld så siger den statement forneden.
        System.out.println("She is too old man, cmon find a younger one!!");
      }
      if (tooYoung) { // Hvis den siger tru på tooYoung så siger den statement forneden.
        System.out.println("She is too young man, cmon find a older one!!");
      }
    }
  }

  public static int calculateMinimumAge(int userAge, boolean isMinister) { //Den her metoder tager værdien og returner regnestykket for neden
    if (isMinister) {
      return 15;
    } else {
      return (userAge / 2) + 7;
    }
  }

  public static int calculateMaximumAge(int userAge) { //Den gør det samme bare med en anden formel
    return (userAge * 2) - 7;
  }

  public static boolean tooYoung(int dateAge, int minAge) {//Her tager den 2 integers, og tjekker hvis de er mindre eller større end hinanden og så returner den enden true eler false
    return dateAge < minAge; // eller kan skrives således så det giver lidt bedre mening
  }
    /*
        if (dateAge < minAge) {
      return true;
    } else
      return false;
  }
     */


  public static boolean tooOld(int dateAge, int maxAge) {
    return dateAge > maxAge; // eller kan skrives således så det giver lidt bedre mening
  }
/*
    if (dateAge > maxAge) {
      return true;
    } else
      return false;
  }
 */

  public static boolean areYouMinister(String isMinister) {//Denne metode ændre true og false til yes og no
    if (isMinister.equalsIgnoreCase("yes")) //equalsIGNORECASe gør at den ignorer om det bliver skrevet med stort y eller n
      return true;
    if (isMinister.equalsIgnoreCase("no")) //Man kan også skrive det som (isminister.equals("no/yes"))
      return false;
    return areYouMinister(isMinister);//Returner metoden, så den går igennem at yes og no funktionerne istedet for false og true.
  }

}

