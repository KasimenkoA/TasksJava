import java.util.Scanner;

public class Task143
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner( System.in );
                System.out.print("������� ���������� ������: ");
                int nn = scanner.nextInt();

                int mm = nn / 60;
                int ss = nn % 60;
                System.out.println("�����: " + mm + ", ������: " + ss);
            }
    }
