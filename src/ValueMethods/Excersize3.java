package ValueMethods;

import java.util.Scanner;

public class Excersize3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);// laver scanner objektet
    int s1 = in.nextInt();
    int s2 = in.nextInt();
    int s3 = in.nextInt();
    System.out.println(isTriangle(s1,s2,s3));
  }
  public static boolean isTriangle(int s1, int s2, int s3){ //Da metoden er boolean, så ville returne give falser eller tru i system out print i main metoden
    return (s1 > 0 && s2 > 0 && s3 > 0 && s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1);
  }
}
// s1>0 = side 1 er større end 0 og
// s2>0 = side 2 er større end 0 og
// s3>0 = side 3 er større end 0 og
//side 1 + side 2 er større end side 3 og
// side 1 + side 3 er større end side 2 og
// side 2 + side 3 er større end side 1

