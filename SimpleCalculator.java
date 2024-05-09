import java.util.*;
public class SimpleCalculator {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      //int a = sc.nextInt();
      //int b = sc.nextInt();
      //int sum = a+b;
      //System.out.println(sum);
      System.out.println("1-TO SUM THE NUMBER");
      System.out.println("2-TO DIFFERENCE THE NUMBER");
      System.out.print("Enter First Number :");
      int a =sc.nextInt();
      System.out.print("Enter The Secound Number :");
      int b = sc.nextInt();
      System.out.print("To Perform the task press number accordingly");
      int z = sc.nextInt();
      if (z==1) {
        System.out.println("The Sum is Given below");
        System.out.println(a+b);
      } else if (z==2){
        System.out.println("The Difference is Given below");
        System.out.println(a-b);
       } else {
        System.out.println("Invalid Button");
      }
    }
}    
