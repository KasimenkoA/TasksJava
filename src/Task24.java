import java.util.Scanner;

public class Task24
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner( System.in );

                System.out.print("������� ���� ���: ");
                String name = scanner.nextLine();

                System.out.println("������, " + name.toUpperCase());
            }
    }
