import java.util.Scanner;

public class Task33
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner( System.in );

                System.out.print( "������� �����������: " );
                int nn = scanner.nextInt();

                if (nn<0)
                    {
                        System.out.println("���");
                    }
                else if (nn<=100)
                    {
                        System.out.println("����");
                    }
                else
                    {
                        System.out.println("���");
                    }
            }
    }
