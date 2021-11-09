package Overloading;

import java.util.Scanner;

public class OpgaverOverloading { //Overloading
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("tast første heltal: "); //spørger brugeren om at indtaste
    int tal1=scanner.nextInt(); // her giver vi muligheden for brugeren at taste ind
    System.out.print("tast andet heltal: "); //spørger brugeren om at indtaste
    int tal2=scanner.nextInt(); // her giver vi muligheden for brugeren at taste ind
    System.out.print("samlet helt tal er: "); // her printer vi resultatet ud
    System.out.println(sumUp(tal1,tal2));//Her printer jeg heltal + heltalmetoden ud.
    //det er med kun heltal for oven
    System.out.println("tast et kommatal: "); //spørger brugeren om at indtaste
    double tal3=scanner.nextDouble(); // her giver vi muligheden for brugeren at taste ind
    System.out.println("tast andet kommatal: "); //spørger brugeren om at indtaste
    double tal4= scanner.nextDouble(); // her giver vi muligheden for brugeren at taste ind
    System.out.print("samlet kommatal er: "); // her printer vi resultatet ud
    System.out.println(sumUp(tal3,tal4));//Her printer jeg kommatal + kommatal metoden ud.
    // det er med kun kommatal for oven
    System.out.print("tast et kommatal: "); //spørger brugeren om at indtaste
    double tal5=scanner.nextDouble(); // her giver vi muligheden for brugeren at taste ind
    System.out.print("tast et hel tal: "); //spørger brugeren om at indtaste
    int tal6=scanner.nextInt(); // her giver vi muligheden for brugeren at taste ind
    System.out.print("samlet komma og helt tal er: "); // her printer vi resultatet ud
    System.out.println(sumUp(tal5,tal6)); //Her printer jeg metoden ud.
    // Det er med kommatal og hel tal hvor de giver samlet et kommatal.
  }
  public static int sumUp(int tal1,int tal2){ //Metode der + heltal sammen
    return tal1+tal2;
  }
  public static double sumUp(double tal3, double tal4){ //Metode der + double sammen
    return tal3+tal4;
  }
  public static double sumUp(double tal5, int tal6){ //Metode der + kommatal og heltal sammen
    return tal5+tal6;
  }

}

