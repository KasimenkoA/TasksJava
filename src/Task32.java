import java.util.Scanner;

public class Task32
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner( System.in );

                System.out.print( "������� ����� ������: " );
                int nn = scanner.nextInt();

                String season;
                switch (nn)
                    {
                        case 12:
                        case 1:
                        case 2:
                            season = "����";
                            break;
                        case 3:
                        case 4:
                        case 5:
                            season = "�����";
                            break;
                        case 6:
                        case 7:
                        case 8:
                            season = "����";
                            break;
                        case 9:
                        case 10:
                        case 11:
                            season = "�����";
                            break;
                        default:
                            season = "�� �������";
                    }

                System.out.println(season);
            }
    }
