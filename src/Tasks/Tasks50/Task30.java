package Tasks.Tasks50;

import java.util.Scanner;

public class Task30
    {
        public static void main( String[] args )
            {
                String name = requestName();
                int age = requestAge();

                System.out.println("���� ����� " + name + ", ���� " + age + " ���.");
            }

        private static String requestName()
            {
                Scanner scanner = new Scanner( System.in );
                System.out.print("��� ���� ���: ");
                return scanner.nextLine();
            }

        private static int requestAge()
            {
                Scanner scanner = new Scanner( System.in );
                System.out.print("������� ���� ���: ");
                return scanner.nextInt();
            }
    }
