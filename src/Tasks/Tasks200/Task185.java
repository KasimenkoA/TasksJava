package Tasks.Tasks200;

import java.util.Scanner;

public class Task185
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                System.out.print("������� ���� ���: ");
                String ss = scanner.nextLine();

                String aa = (ss.startsWith( "�" ))?"���� ��� ���������� �� ����� �" : "���� ��� �� ���������� �� ����� �";
                System.out.println(aa);
            }
    }
