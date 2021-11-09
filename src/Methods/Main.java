package Methods;

public class Main {

  public static void main(String[] args) {
    firstMethod();
    secondMethod();
    printTwice("Dont make me say this twice");
    enkelNummer(67);
    andetNummer(8.9);
  }

  public static void firstMethod() {
    System.out.println("metode 1");
  }

  public static void secondMethod() {
    System.out.println("metode 2");
    double PI = 3.14;
    int moTopHastighed = 4;
    System.out.println(PI);
    System.out.println(moTopHastighed);

  }

  public static void printTwice(String string) { //s er bare navnet på string altså variablen
    System.out.println(string);
    System.out.println(string);
  }

  public static void enkelNummer(int antalKg) {
    System.out.println(antalKg);
  }

  public static void andetNummer(double antalgram) {
    System.out.println(antalgram);
  }

  public static int myMethod(){
    int x=42;
    double tal=myMethod();
    return x; //der skal altid stå return når der ikke står void. //når den rammer return så køre den til start igen

  }
}

