package Tasks.Tasks250;

import java.util.Scanner;

public class Task210
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);

                System.out.print("������� ���� ���: ");
                String ss1 = scanner.nextLine();

                System.out.print("������� ��� �������: ");
                String ss2 = scanner.nextLine();

                showInfo(ss1,ss2);
            }

        private static void showInfo( String ss1, String ss2 )
            {
                System.out.printf("��� ����� %s, ��� %s ���.", ss1,ss2);
            }
    }
