import java.util.Scanner;

public class Task15
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner( System.in );

                System.out.print("������� �����: ");
                int nn = scanner.nextInt();

                String ss = "�� �������";
                if (nn == 1) ss = "�����������";
                if (nn == 2) ss = "�������";
                if (nn == 3) ss = "�����";

                System.out.println(ss);
            }
    }
