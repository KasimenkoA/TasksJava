package Tasks.Tasks300;

import java.util.Scanner;

public class Task265
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);

                System.out.print("������� ����������: ");
                double ll = scanner.nextDouble();

                System.out.print("������� �����: ");
                double tt = scanner.nextDouble();

                double speed = ll / tt;
                System.out.println("Speed: " + speed);
            }
    }
