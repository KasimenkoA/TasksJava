import java.util.Scanner;

public class Task16
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner( System.in );

                System.out.print("������� �����: ");
                int nn = scanner.nextInt();

                String ss = "";

                switch (nn)
                    {
                        case 1:
                            ss = "�����������";
                            break;
                        case 2:
                            ss = "�������";
                            break;
                        case 3:
                            ss = "�����";
                            break;
                        default:
                            ss = "�� �������";
                    }

                System.out.println(ss);
            }
    }
