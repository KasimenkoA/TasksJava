import java.util.Scanner;

public class Task145
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner( System.in );
                System.out.print("������� ���� ���: ");
                String name = scanner.nextLine();

                char ch = name.charAt( 0 );
                if (ch == '�' || ch == '�')
                    {
                        System.out.println("���� ��� � ������ ������");
                    }
                else
                    {
                        System.out.println("���� ��� �� � ������ ������");
                    }
            }
    }
