import java.util.Scanner;

public class Task3
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner( System.in );

                System.out.print("������� ���� ���: ");
                String name = scanner.nextLine();

                System.out.print("������� �������: ");
                int age = scanner.nextInt();

                System.out.printf("��� ����� %s. ��� ������� %d ���.", name, age);
            }
    }
