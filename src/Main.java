
import java.util.Scanner;

public class Main {



       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.out.print("Введите год: ");
           int year = scanner.nextInt();
           if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
               System.out.println(year + " - высокостный год.");
           } else {
               System.out.println(year + " - не высокостный год.");
           }
       }
   }

