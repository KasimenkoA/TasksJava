package Tasks.Tasks150;

import java.util.Scanner;

public class Task144
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner( System.in );

                System.out.print("������� ��� �������: ");
                int age = scanner.nextInt();

                System.out.print("������� ��� ������� ������� �� �������: (1 - BEGINNER, 2 - MEDIUM, 3 - ADVANCED) ");
                int level = scanner.nextInt();

                if (age > 5 && level > 1)
                    {
                        System.out.println("�� ������ ����� �� �����.");
                    }
                else
                    {
                        System.out.println("�� �� ������ ����� �� �����.");
                    }
            }
    }


