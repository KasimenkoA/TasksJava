import java.util.Scanner;

public class Task22
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner( System.in );

                System.out.print("������� �����: ");
                int nn = scanner.nextInt();

                int nn_rest = nn % 2;
                System.out.println("�������: " + nn_rest);

                if (nn_rest == 0)
                    {
                        System.out.println("������");
                    }
                else
                    {
                        System.out.println("��������");
                    }
            }
    }
