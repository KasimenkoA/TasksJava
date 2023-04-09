import java.util.Scanner;

public class Task2
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner( System.in );
                System.out.print("¬ведите число: ");
                int nn = scanner.nextInt();
                int mm = nn * nn;
                System.out.println(" вадрат числа " + nn + " равен " + mm + ".");
            }
    }
