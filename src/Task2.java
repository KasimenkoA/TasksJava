import java.util.Scanner;

public class Task2
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner( System.in );
                System.out.print("������� �����: ");
                int nn = scanner.nextInt();
                int mm = nn * nn;
                System.out.println("������� ����� " + nn + " ����� " + mm + ".");
            }
    }
